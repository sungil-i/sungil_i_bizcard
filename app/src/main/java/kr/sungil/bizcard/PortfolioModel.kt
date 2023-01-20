package kr.sungil.bizcard

/*****
 * idx: 인덱스 (정수)
 * name: 이름 (문자열)
 * desc: 설명 (문자열)
 * imageUrl: 이미지 주소 (문자열)
 */

data class PortfolioModel(
	var idx: Int,
	var name: String,
	var desc: String,
	var imageUrl: String
)