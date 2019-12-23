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
	div#btn-span-comment {
		display: inline-block;
		border: 1px solid gray;
		text-align: center;
		font-size: 13px;
		font-weight: bold;
		cursor: pointer;
		padding: 5px;
	}
	
	div#btn-span-comment:active {
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
	
	ul#comment-list {
		list-style-type: none;
		margin: 0;
		padding: 0;
	}
	
	ul#comment-list li.reply {
		background-color: white;
		border-bottom: 1px solid gray;
		padding: 10px;
	}
	
	div.replyer {
		font-weight: bold;
		float: left;
	}
	
	div.mod-del {
		float: right;
		width: 80px;
	}
	
	div.reply {
		clear: both;
	}
	
	div.replydate {
		color: gray;
	}
	
	span.modify, span.delete {
		cursor: pointer;
		border-bottom: 1px dotted gray;
		display: inline-block;
		float: right;
		margin-left: 10px;
	}
	
	span.register, span.cancel {
		cursor: pointer;
		border-bottom: 1px dotted gray;
		display: inline-block;
		margin-left: 10px;
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


<div id="btn-span-comment">
	댓글
	<span id="reply-count"></span> 
	<span id="toggle">∨</span>
</div>

<div id="comment-area" data-stretch="false">
	
	<ul id="comment-list"></ul>
	
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


<script src="/resources/script/jquery-3.4.1.js"></script>
<script src="/resources/script/reply.js"></script>

<script>
	console.log(replyService);
	
	var spanReplyCount = document.querySelector('span#reply-count');
	var spanToggle = document.querySelector('span#toggle');
	var objDivBtn = document.querySelector('div#btn-span-comment');
	var objCommentArea = document.querySelector('div#comment-area');
	var objTextArea = document.querySelector('textarea[name=reply]');
	var objSpanCounter = document.querySelector('span#char-counter');
	var bnoValue = ${board.num}; // 현재 게시글 번호
	var objCommentList = document.querySelector('ul#comment-list');
	var btnReg = document.querySelector('button#btnReg');
	
	
	showList();
	
	
	function showList() {
		
		replyService.getList({bno: bnoValue}, function (list) {
			var str = '';
			
			list.forEach(function (item) {
				console.log(item);
				str += '<li class="reply" data-rno="' + item.rno + '">';
				str += '    <div class="modify-reply-input"></div>';
				
				str += '    <div class="show-reply">';
				str += '        <div class="replyer">' + item.replyer + '</div>';
				str += '        <div class="mod-del">';
				str += '            <span class="modify">수정</span>';
				str += '            <span class="delete">삭제</span>';
				str += '        </div>';
				str += '        <div class="reply">' + item.reply + '</div>';
				str += '        <div class="replydate">' + replyService.displayTime(item.replydate) + '</div>';
				str += '    </div>';
				str += '</li>';
			});
			
			objCommentList.innerHTML = str;
			spanReplyCount.innerHTML = list.length;
		});
		
	} // showList
	
	
	btnReg.addEventListener('click', function () {
		
		var taReply = document.querySelector('textarea[name=reply]');
		var inputReplyer = document.querySelector('input[name=replyer]');
		
		var reply = {
				reply: taReply.value.trim(),
				replyer: inputReplyer.value.trim(),
				bno: bnoValue
		};
		
		replyService.add(reply, function (result) {
			alert('댓글 등록 ' + result);
			showList();
		});
		
		document.querySelector('form#frm').reset();
	});
	
	
	// 동적 이벤트 바인딩
	// 댓글 삭제 클릭이벤트
	$('ul#comment-list').on('click', 'span.delete', function (event) {
		
		var delConfirm = confirm('정말로 삭제 하시겠습니까?');
		
		if (delConfirm == false) {
			return;
		}
		
		var rno = $(this).closest('li.reply').data('rno');
		console.log('rno : ' + rno);
		
		replyService.remove(rno, function (result) {
			alert('댓글 삭제 ' + result);
			
			showList();
		});
	});
	
	
	// 댓글 수정 폼
	$('ul#comment-list').on('click', 'span.modify', function (event) {
		
		$('div.modify-reply-input').css('display', 'none');
		$('div.show-reply').css('display', 'block');
		
		
		var $liReply = $(this).closest('li.reply');
		
		var $divShow = $liReply.find('div.show-reply');
		$divShow.css('display', 'none');
		
		var replyNo = $liReply.data('rno');
		var replyName = $liReply.find('div.replyer').text();
		var replyContent = $liReply.find('div.reply').text();
		
		console.log('replyName: ' + replyName + ', replyContent: ' + replyContent);
		
		
		var $divReplyInput = $(this).closest('li.reply').find('div.modify-reply-input');
		
		var str = '';
		str += '<input type="text" name="reply-name" value="' + replyName + '" readonly><br>';
		str += '<textarea rows="3" cols="50" name="reply-content">' + replyContent + '</textarea><br>';
		str += '<span class="register">등록</span>';
		str += '<span class="cancel">취소</span>';
		
		$divReplyInput.html(str);
		$divReplyInput.css('display', 'block');
	});
	
	
	// 댓글 수정 등록
	$('ul#comment-list').on('click', 'span.register', function (event) {
		
		var $liReply = $(this).closest('li.reply');
		
		var replyNo = $liReply.data('rno');
		var replyContent = $liReply.find('textarea[name=reply-content]').val();
		
		var reply = { rno: replyNo, reply: replyContent };
		
		replyService.update(reply, function (result) {
			alert('댓글 수정 ' + result);
			
			showList();
		});
		
	});
	
	
	// 댓글 수정 취소
	$('ul#comment-list').on('click', 'span.cancel', function (event) {
		
		var $liReply = $(this).closest('li.reply');
		
		$liReply.find('div.modify-reply-input').css('display', 'none');
		$liReply.find('div.show-reply').css('display', 'block');
	});
	
</script>

<script>

	
	
	objDivBtn.addEventListener('click', function (event) {
		//event.target
		console.log(objCommentArea.dataset.stretch);
		var isStretch = objCommentArea.dataset.stretch;
		console.log('isStretch : ' + isStretch);
		
		if (isStretch == 'true') { // 현재상태가 댓글영역이 펴져있을때
			//objCommentArea.style.display = 'none';
			objCommentArea.dataset.stretch = 'false';
			spanToggle.innerHTML = '∨';
		} else { // 현재상태가 댓글영역이 접혀있을때
			//objCommentArea.style.display = 'block';
			objCommentArea.dataset.stretch = 'true';
			spanToggle.innerHTML = '∧';
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









    