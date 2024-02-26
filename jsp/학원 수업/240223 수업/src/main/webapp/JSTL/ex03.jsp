<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSTL 태그 라이브러리를 사용하겠다고 선언 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 포맷팅 라이브러리 태그를 사용하겠다고 선언 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="coffee" value="${param.coffee_str }" />
	<c:set var="amount" value="${param.su }" />
	
	<c:choose>
		<c:when test="${coffee == 1}">
			<c:set var="str" value="아메리카노" />
			<c:set var="price" value="3000" />
		</c:when>
		<c:when test="${coffee == 2}">
			<c:set var="str" value="카페라떼" />
			<c:set var="price" value="4000" />
		</c:when>
		<c:when test="${coffee == 3}">
			<c:set var="str" value="카푸치노" />
			<c:set var="price" value="4500" />
		</c:when>
		<c:when test="${coffee == 4}">
			<c:set var="str" value="마끼아또" />
			<c:set var="price" value="4500" />
		</c:when>
	</c:choose>
	
	<div align="center">
		<table border="1" width="350">
			<tr>
				<th>커피 종류</th>
				<td>${str}</td>
			</tr>
			
			<tr>
				<th>커피 단가</th>
				<!-- <td>${price}원 </td> -->
				<td><fmt:formatNumber value="${price }" /> 원</td>
			</tr>
			
			<tr>
				<th>공급가액</th>
				<td>
					<c:set var="gong" value="${price * amount }" />
					<fmt:formatNumber value="${gong }" />원
				</td>
			</tr>
			
			<tr>
				<th>부가세액</th>
				<td>
					<c:set var="bu" value="${(price * amount) * 0.1 }" />
					<fmt:formatNumber value="${bu }" />원
				</td>
			</tr>
			
			<tr>
				<th>총 금액</th>
				<td>
					<fmt:formatNumber value="${gong + bu }" />원
				</td>
			</tr>
		</table>
	</div>
	<!--
	공급가액: 물건값
	부가세: 공급가액 + 10%
	공급대가: 공급가액 + 부가세
	
	참고
	물건(과세, 면세)
	최소한의 먹거리, 생필품, 의료, 보건, 문화에 대해서는 부가세를 과세하지 않는다.
	
	가공하지 않은 국내, 국외 식용 -> 면세
	
	면세
	가공하지 않은(단순 가공 포함) 국내, 국외 식용 -> 면세(쌀, 배추, 파인애플 등)
	가공하지 않은 국내 비식용 -> 면세(단, 국외: 코끼리, 이구아나, 선인장 등은 과세)
	병원은 대부분 면세(미용목적은 과세)
	은행 면세
	보험 면세
	책 면세(단, 잡지책 또는 책 안의 광고는 과세)
	미술관, 과학관 등은 면세(단, 영화관은 과세)
	수돗물: 면세... 생수: 과세
	연탄: 면세... 휘발유, 경유, 등유 등은 과세
	토지 매매: 면세
	토지 임대: 과세(단, 내 집 앞마당 임대는 면세)
	
	돼지고기 면세, 햄은 과세
	곶감: 면세
	김치, 두부: 과세, 면세 -> 통채로 팔면 면세, 소분해서 팔면 과세
	
	온라인상에서 주류, 의약품 거래 X
	-->
</body>
</html>










