package com.codit;

public class MyFirstClass {
	public static void main(String[] args) {

		// 패키지명 : 폴더 구분 또는 소스 코드 그룹핑 용도
		// - 폴더에 들어가는 이름은 모두 소문자!
		// - 마지막 Class 명은 첫글자는 대문자로 시작하는 카멜표기법으로 표기
		// - 패키지명은 보통 회사명 + 프로젝트 별칭으로 구성된다.
		// com.codeit.myproject.view.MyView
		// com.codeit.myproject.model.MyDataVO

		// 자주 사용하는 단축키 모음 ★★★★★
		// 필수적인 기본 단축키들 (외워라!!)
		// shift + shift (Mac 동일) : search everywhere, 모든 탐색기(명령어, 파일, 키워드)
		// ctrl + ctrl (cmd + cmd) : cmd 명령어 호출창 열기
		// alt + enter (option + enter) : quick fix(에러 자동 고치기)
		// tab (Mac 동일) : 들여쓰기 또는 자동완성
		// shift + tab (Mac 동일) : 역들여쓰기
		// ctrl + space (Mac 동일) : 자동완성
		// ctrl + shift + space (Mac 동일) : 스마트 자동완성 추천
		// ctrl + / (cmd + /) : 주석 자동완성
		// ctrl + shift + / (cmd + option + /) : 여러줄 주석 자동완성
		// ctrl + a (cmd + a) : 모든 라인 선택
		// ctrl + w (option + ↑) : 확장된 선택, 입력할수록 범위 커짐
		// ctrl + d (cmd + d) : 라인 복사
		// ctrl + y (cmd + delete) : 선택된 라인지우기
		// ctrl + z (cmd + z) : 되돌리기 (undo)
		// ctrl + shift + z (cmd + shift + z) : 다시 실행하기 (redo)
		// ctrl + ↑, ↓ (cmd + ↑, ↓) : 커서 기준으로 화면이동
		// ctrl + <-, -> (option + ←, →) : 키워드 이동, 빠르게 이동 가능 (Home, End 키 활용 추천!)
		// alt + ↑, ↓ (cmd + ↑, ↓) : 위아래로 코드 이동 빠르게 하기 (메소드, 클래스 단위)
		// alt + <-, -> (cmd + option + ←, →) : 코드 파일간 이동
		// alt + shift + ↑ (option + shift + ↑) : 선택된 라인 위로 옮기기
		// alt + shift + ↓ (option + shift + ↓) : 선택된 라인 아래로 옮기기
		// ctrl + alt + t (cmd + option + t) : if, for, try-catch문 자동생성 ★★★★

		// 탐색 (find)
		// ctrl + f (cmd + f) : 파일 내에서 키워드 찾기 -> replace로 교체 가능
		// ctrl + r (cmd + r) : replace 상태에서 열기
		// 단어가 선택된 상태에서 ctrl + f (cmd + f) : 선택된 단어 찾기
		// ctrl + shift + f (cmd + shift + f) : 프로젝트 또는 전체 찾기
		// ctrl + shift + r (cmd + shift + r) : 프로젝트 또는 전체 교체
		// shift + shift (Mac 동일) : 모든 찾기 모드
		// shift + f3 (Mac 동일) : 이전 찾기
		// f3 (Mac 동일) : 다음 찾기

		// 리팩토링
		// ctrl + alt + l (cmd + option + l) : 정해진 포멧으로 자동 정렬
		// ctrl + shift + enter (cmd + shift + enter) : 세미콜론 자동완성
		// alt + shift + insert (Cmd + Option + 8) : 열선택 모드 전환
		// alt + shift + click (option + shift + click) : 단어 선택 모드로 전환
		// shift + f6 (Mac 동일) : rename (변경된 이름은 다른 파일에서도 올바르게 변경됨)
		// ctrl + shift + u (cmd + shift + u) : 대소문자 변환
		// ctrl + alt + shift + t (ctrl + t) : 리팩토링 모드화
		// ctrl + alt + v (cmd + option + v) : extract variable
		// ctrl + alt + m (cmd + option + m) : extract method
		// ctrl + alt + f (cmd + option + f) : extract field
		// ctrl + alt + shift + u (cmd + option + u) : UML 클래스 다이어그램
		// alt + insert (cmd + n or cmd + insert) : generate 단축키 -> get/setter, toString 자동완성용

		// import : 외부 패키지를 가져오는 명령어
		// F4나 ctrl + alt + -> / ctrl + cmd + ->로 소스코드 위치로 이동!
		// -> 돌아올땐 ctrl + alt + <- ctrl + cmd + <-, 또는 마우스 5키 중에 뒤로가기
		// * : 모든 모듈 임포트용도, 사용하지 않는 모듈을 모두 임포트함으로 좋지않다고한다.
		//  -> import java.util.*;는 코테 용도로 외워라!!!
	}
}
