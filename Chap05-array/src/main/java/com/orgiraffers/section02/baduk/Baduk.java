package com.orgiraffers.section02.baduk;

import java.util.Scanner;

public class Baduk {
    public static void main(String[] args) {
        Baduk baduk = new Baduk();
        baduk.baduck();
    }

    public void baduck() { // 바둑 판을 만드는것
        String[][] board = new String[19][19]; // 바둑판의 가로세로 열을 만들어주기위해 작성
        //인덱스
        for (int i = 0; i < board.length; i++) { // 가로의 길이
            for (int j = 0; j < board[0].length; j++) { //세로의 길이
                //인덱스 i를 넣어줘야함
                board[i][j] = "[ ]"; // 위치를 확인 잘하기위해 [] 에 넣는 위치 잘 보이기위해 작성
                System.out.print(board[i][j]); // 가로
            }
            System.out.println(); // 세로
        }
        String play = " "; // 검증 이젠 게임을 해야하니 게임을 할 수있는 로직을짜줌
        Scanner scanner = new Scanner(System.in); // 화면을 입력받으려고
        int[] index = new int[2]; // 첫번쨰랑 두번쨰 좌표를 만드려고 2개를 작성
        int turn = 0; // 두명에서 돌아가면서 해야하니까 턴 제를 만듬 턴을 어떻게 구분할것인가 밑에 작성해야함
        while (!play.equals("exit")) { // 계속 플레이를 해야해서 와일문으로 작성 언제 끝날지 모르니까 반복해야함!! //equals 같은지 아닌지 확인
            System.out.print(" 첫 번째 좌표를 입력해주세요 : ");
            index[0] = scanner.nextInt();
            System.out.println("두 번째 좌표를 입력해주세요 : ");
            index[1] = scanner.nextInt();

            if (board[index[0]][index[1]].equals("[ ]")) { // 사용자가 입력한 좌표가 비어있는지 아닌지 확인하기위해 "[]"로 물어봄
                if (turn % 2 == 0) { //2로 나눴을떄 짝수 호수
                    board[index[0]][index[1]] = "[흑]";
                } else {
                    board[index[0]][index[1]] = "[백]";
                }
            } else { // 흑백이 똑같은 위치에 놨을떄 확인 하기위해 작성 짝수 홀수로 서로 같은 턴인지 아닌지 확인
                System.out.println("같은 위치에 바둑돌을 놓을 수 없습니다.");
                turn += 2;
                continue;
            }

            for (int i = 0; i < board.length; i++) { // 바둑돌을 놓은 위치를 보여주시위해 작성하는것
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j]); // i와 j가어디 위치한지 표시해주는 출력
                }
                System.out.println();
            }
            turn++;
        }// 입력 제어 출력
    }
}