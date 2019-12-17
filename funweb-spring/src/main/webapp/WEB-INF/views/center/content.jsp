<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Fun Web</title>
<link href="/resources/css/default.css" rel="stylesheet" type="text/css" media="all">
<link href="/resources/css/subpage.css" rel="stylesheet" type="text/css"  media="all">
<link href="/resources/css/print.css" rel="stylesheet" type="text/css"  media="print">
<link href="/resources/css/iphone.css" rel="stylesheet" type="text/css" media="screen">
<!--[if lt IE 9]>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js" type="text/javascript"></script>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/ie7-squish.js" type="text/javascript"></script>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->

<style>
	span#btn-span-comment {
		display: inline-block;
		width: 70px;
		height: 23px;
		border: 1px solid gray;
		text-align: center;
		font-size: 13px;
		font-weight: bold;
		cursor: pointer;
	}
	
	span#btn-span-comment:active {
		background-color: orange;
		color: white;
		position: relative;
		top: 1px;
		left: 1px;
	}
	
	div#comment-area {
		margin-top: 20px;
		padding: 10px;
		background-color: lightgray;
		border-top: 1px solid gray;
		border-bottom: 1px solid gray;
		display: none;
	}
	
	div#comment-write {
		border: 1px solid gray;
		background-color: white;
		padding: 20px;
		margin-top: 20px;
	}
	
	div#comment-list {
		padding: 10px;
	}
	
	div#comment-area[data-stretch="false"] {
		display: none;
	}
	
	div#comment-area[data-stretch="true"] {
		display: block;
	}
</style>
</head>
<body>
<div id="wrap">
	<!-- 헤더 영역 -->
	<jsp:include page="../include/header.jsp" />

	<div class="clear"></div>
	<div id="sub_img_center"></div>
	
	<div class="clear"></div>
	<%-- nav 영역 --%>
	<jsp:include page="../include/nav_center.jsp" />

<article>
    
<h1>Notice Content</h1>

<table id="notice">
	<tr>
		<th class="twrite">글번호</th>
		<td class="left" width="200">${board.num}</td>
		<th class="twrite">조회수</th>
		<td class="left" width="200">${board.readcount}</td>
	</tr>
	<tr>
		<th class="twrite">작성자명</th>
		<td class="left">${board.username}</td>
		<th class="twrite">작성일자</th>
		<td class="left"><fmt:formatDate value="${board.regDate}" pattern="yyyy년 MM월 dd일" /></td>
	</tr>
	<tr>
		<th class="twrite">글제목</th>
		<td class="left" colspan="3">${board.subject}</td>
	</tr>
	<tr>
		<th class="twrite">글내용</th>
		<td class="left" colspan="3"><pre>${board.content}</pre></td>
	</tr>
</table>


<div id="table_search">
	<input type="button" value="글수정" class="btn" onclick="location.href='/board/modify?num=${board.num}&pageNum=${pageNum}';">
	<input type="button" value="글삭제" class="btn" onclick="location.href='/board/delete?num=${board.num}&pageNum=${pageNum}';">
	<input type="button" value="답글쓰기" class="btn" onclick="location.href='/board/reply?reRef=${board.reRef}&reLev=${board.reLev}&reSeq=${board.reSeq}&pageNum=${pageNum}';">
	<input type="button" value="목록보기" class="btn" onclick="location.href='/board/list?pageNum=${pageNum}';">
</div>


<div class="clear"></div>


<span id="btn-span-comment">댓글 ∨</span>

<div id="comment-area" data-stretch="false">
	<div id="comment-list">댓글목록영역</div>
	<div id="comment-write">
		<form id="frm">
			이름: <input type="text" name="replyer"><br>
			댓글내용: <br>
			<textarea rows="3" cols="50" name="reply"></textarea>
			<span id="char-counter">0/100</span>
			<br>
			<button type="button" id="btnReg">등록</button>
		</form>
	</div>
</div>



</article>
    
	<div class="clear"></div>
    
    <!-- 푸터 영역 -->
	<jsp:include page="../include/footer.jsp" />
</div>

<script>
	var objSpanBtn = document.querySelector('span#btn-span-comment');
	var objCommentArea = document.querySelector('div#comment-area');
	var objTextArea = document.querySelector('textarea[name=reply]');
	var objSpanCounter = document.querySelector('span#char-counter');
	
	
	objSpanBtn.addEventListener('click', function (event) {
		//event.target
		console.log(objCommentArea.dataset.stretch);
		var isStretch = objCommentArea.dataset.stretch;
		console.log('isStretch : ' + isStretch);
		
		if (isStretch == 'true') { // 현재상태가 댓글영역이 펴져있을때
			//objCommentArea.style.display = 'none';
			objCommentArea.dataset.stretch = 'false';
			objSpanBtn.innerHTML = '댓글 ∨';
		} else { // 현재상태가 댓글영역이 접혀있을때
			//objCommentArea.style.display = 'block';
			objCommentArea.dataset.stretch = 'true';
			objSpanBtn.innerHTML = '댓글 ∧';
		}
	});
	
	
	objTextArea.addEventListener('keyup', function (event) {
		var length = objTextArea.value.length;
		if (length > 100) {
			objSpanCounter.style.color = 'red';
		} else {
			objSpanCounter.style.color = 'green';
		}
		objSpanCounter.innerHTML = length + '/100';
	});

</script>

</body>
</html>









    