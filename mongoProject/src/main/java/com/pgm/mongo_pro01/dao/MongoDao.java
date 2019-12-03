package com.pgm.mongo_pro01.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.pgm.mongo_pro01.dto.BoardVO;

public class MongoDao {
	private final int MONGO_PORT = 27017;
	private final String MONGO_HOST = "localhost";
	private final String DB_NAME = "test";
	private MongoClient mongoConn;
	
	private MongoDao() {}
	private static MongoDao dao=new MongoDao();
	public static MongoDao getInstance() {
		return dao;
	}
	
	private MongoCollection<Document> getMongoCollection(){
		MongoCollection<Document> collection=null;
		
		try {
			mongoConn=new MongoClient(MONGO_HOST,MONGO_PORT);
			collection=mongoConn.getDatabase(DB_NAME).getCollection("board");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return collection;
	}
	
	private void close() {
		try {
			mongoConn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void insert(BoardVO vo) {
		MongoCollection<Document> coll=null; //{key:value,...}
		try {
			coll=getMongoCollection();
			Document doc=new Document("bno",vo.getBno())
					.append("writer", vo.getWriter())
					.append("title", vo.getTitle())
					.append("content", vo.getContent());
			coll.insertOne(doc); 

		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			close();
		}
	}
	
	public List<BoardVO> find(){
		List<BoardVO> list=new ArrayList<BoardVO>();
		
		MongoCollection<Document> coll=null;
		MongoCursor<Document> cursor=null;
		try {
			coll=getMongoCollection();
			cursor=coll.find().iterator();
			while(cursor.hasNext()) {
				BoardVO vo=new BoardVO();
				Document doc=cursor.next();
				vo.setBno(doc.getDouble("bno"));
				vo.setWriter(doc.getString("writer"));
				vo.setTitle(doc.getString("title"));
				vo.setContent(doc.getString("content"));
				list.add(vo);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	public BoardVO findOne(double bno){
		BoardVO vo=null;
		
		MongoCollection<Document> coll=null;
		MongoCursor<Document> cursor=null;
		BasicDBObject inQuery=null;
		try {
			inQuery.put("bno", bno);
			coll=getMongoCollection();
			cursor=coll.find(inQuery).iterator();
			if(cursor.hasNext()) {
				vo=new BoardVO();
				Document doc=cursor.next();
				vo.setBno(doc.getDouble("bno"));
				vo.setWriter(doc.getString("writer"));
				vo.setTitle(doc.getString("title"));
				vo.setContent(doc.getString("content"));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			close();
		}
		return vo;
	}
	
	public void update(BoardVO vo) {
		MongoCollection<Document> collection=null;
		BasicDBObject inQuery=null;
		try {
			collection=getMongoCollection();
			inQuery=new BasicDBObject();
			inQuery.put("bno", vo.getBno());
			
			BasicDBObject newDoc=new BasicDBObject()
					.append("$set", new BasicDBObject("title",vo.getTitle())
							.append("content", vo.getContent())
							.append("writer", vo.getWriter()));
			collection.updateOne(inQuery, newDoc);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void delete(double bno) {
		MongoCollection<Document> collection=null;
		BasicDBObject inQuery=null;
		try {
			collection=getMongoCollection();
			inQuery=new BasicDBObject();
			inQuery.put("bno", bno);
			collection.deleteOne(inQuery);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			close();
		}
	}

	
}
