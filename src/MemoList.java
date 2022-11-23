import java.util.Scanner;

class input {
    // 1번 입력메뉴 접근
    // 스캐너를 통해 이름, 비밀번호, 메모내용 입력받음
    // 입력받은 내용을 MemoClass에 보냄
//    Scanner scanner = new Scanner(System.in);
//    String memo = scanner.nextLine();

}

class delete {
    // 4번 삭제메뉴 접근
    // 리스트에 저장된 글 번호를 입력하면 삭제
    // 비밀번호 입력내용 확인 후 -> if(inputPw == password) { delete.해당글} else { return "비밀번호가 일치하지 않습니다" };
    // 비밀번호 일치 글 삭제: 해당 값이 저장된 인덱스를 Null 값으로 저장 후 마지막 인덱스로 Null값 이동
}

class revise {
    // 3번 수정메뉴 접근
    // 리스트에 저장된 글 번호를 입력 후 글 번호 일치 -> 비밀번호를 묻는다, 번호가 없는 경우 System.out.println("존재하지 않는 글입니다");
    // 비밀번호 입력내용 확인 후 -> if(inputPw == password) { update.해당글} else { return "비밀번호가 일치하지 않습니다" };
    // 수정내용 입력 후 MemoClass로 보냄
}

public class MemoList {
    public static void main(String[] args) {
//       Scanner scan = new Scanner(System.in);
//       System.out.println("메뉴를 선택하세요 1. 입력 2. 목록보기 3. 수정 4. 삭제 5. 종료");
//       String resultScan = scan.nextLine();
    // 글이 리스트에 저장될때마다 인덱스 값이 증가한다
    // 글의 삭제 후 인덱스 값을 새로고침

    //if (String resultScan == "입력") {
        // System.out.println("=내용을 입력하세요=");
        // 인풋 클래스 실행
            // System.out.println("내용이 저장되었습니다.");
    //}

    // elseif (String resultScan == "목록보기") {
        // getMemo 메서드 실행
    //}

    // elseif (String resultScan == "삭제") {
        // System.out.println("= 삭제할 글 번호를 입력하세요=");
            // 번호 확인 번호가 없는 경우 System.out.println("존재하지 않는 글입니다");
                // System.out.println("비밀번호?");
                    // 비밀번호 일치 글 삭제: 삭제 클래스
                    // 비밀번호 불일치 System.out.println("비밀번호가 일치하지 않습니다")
    // }

    // elseif (String resultScan == "수정") {
        // System.out.println("=수정할 글 번호를 입력하세요=");
            // System.out.println("비밀번호?");
                // 번호가 없는 경우 System.out.println("존재하지 않는 글입니다");}
                // 비밀번호 일치 글 수정 -> 수정 클래스
                // 비밀번호 불일치 System.out.println("비밀번호가 일치하지 않습니다")
    //}
    // else { return 종료 }

    //void getMemo {
        // 2번 메뉴에 접근
        // 메뉴 리스트에 저장된 메모 name, text, 저장된 시간 조회
        //}
    }
}