<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		li.room:hover {
			background-color: yellowgreen;
		}
		li.room:active {
			background-color: orange;
		}
	</style>
</head>
<body>

<div id="wrap">
	<!-- 헤더 영역 -->
	<jsp:include page="../include/header.jsp" />

  <div class="clear"></div>
  <div id="sub_img_member"></div>
  <div class="clear"></div>
  
	<!-- nav 영역 -->
	<jsp:include page="../include/nav_member.jsp" />
  
	<article>
		<h1>Chatting Rooms List</h1>
			
		<p>채팅닉네임을 정하고 기존 채팅방에서 참여하고 싶은 방을 더블클릭하세요.</p>
		
		<ul id="chatting-rooms">
			<c:choose>
				<c:when test="${not empty roomsList}">
					<c:forEach var="item" items="${roomsList}">
						<li class="room">${item.room} (참가자 ${item.size}명)</li>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<li class="room">현재 개설된 채팅방이 없습니다.</li>
				</c:otherwise>
			</c:choose>
		</ul>
	
	
		<form action="/chatting/join" onsubmit="return checkRoomNameDuplicate();">
			채팅 닉네임 : <input type="text" id="nickname" name="nickname" placeholder="필수입력사항입니다."><br>
			<br><br>
			
			<fieldset>
			<legend>새로운 채팅방 만들기</legend>
				채팅방 새이름 : <input type="text" id="room" name="room" placeholder="채팅방 이름을 입력하세요."><br>
				<input type="submit" value="채팅방 참가하기">
			</fieldset>
		</form>	
			
	</article>
	
	
    <div class="clear"></div>
    
    <!-- 푸터 영역 -->
	<jsp:include page="../include/footer.jsp" />
</div>


<script src="/resources/script/jquery-3.4.1.js"></script>
<script>
	var objUl = document.getElementById('chatting-rooms');
	var nickname = document.getElementById('nickname');
	var room = document.getElementById('room'); 

	function showRoomsList() {
		$.ajax({
			url: 'chattingRoomsListJson.do',
			success: function (arr) {
				console.log(arr);
				
				let str = '';
				if (arr.length > 0) {
					for (let item of arr) {
						str += '<li class="room">' + item.room + ' (참가자 ' + item.size + '명)</li>';
					}
				} else {
					str = '<li class="room">현재 개설된 채팅방이 없습니다.</li>';
				}
				
				objUl.innerHTML = str;
			}
		});
		
	} // showRoomsList
	
	
	function checkRoomNameDuplicate() {
		if (nickname.value == '') {
			alert('닉네임은 필수 입력사항입니다.');
			nickname.focus();
			return false;
		}
		if (room.value == '') {
			alert('채팅방 이름은 한 글자 이상이어야 합니다.');
			room.focus();
			return false;
		}
		
		var isRoomDuplicate = false;
		$.ajax({
			async: false,
			url: 'checkRoomNameDuplicateJson.do',
			data: { room : room.value },
			success: function (data) {
				isRoomDuplicate = data;
			}
		});
		
		if (isRoomDuplicate) {
			alert('이미 존재하는 채팅방 이름입니다.\n다른 채팅방 이름으로 생성해주세요.');
			return false;
		} else {
			return true;
		}
	} // checkRoomNameDuplicate
	
	
	$(document).on('dblclick', 'li.room', function (event) {
		let room = event.target.innerText;
		let index = room.indexOf(' (');
		room = room.substr(0, index);
		
		if (nickname.value == '') {
			alert('닉네임은 필수 입력사항입니다.');
			nickname.focus();
			return;
		}
		
		$.ajax({
			async: false,
			url: 'checkNicknameDuplicateJson.do',
			data: { room: room, nickname: nickname.value },
			success: function (isNicknameDuplicate) {
				if (isNicknameDuplicate == true) {
					alert('닉네임이 중복됩니다.\n다른 닉네임으로 입장해 주세요.');
				} else {
					location.href = 'chatting.do?room=' + room + '&nickname=' + nickname.value;
				}
			}
		});
	});
	
	
	setInterval(showRoomsList, 5000);
	
</script>

</body>
</html>