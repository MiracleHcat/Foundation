//#include <stdio.h>
//#include <stdlib.h>
//#include <time.h>
//
//int main() {
//    srand(time(0));  // ��ʼ�������������
//    int playerPredictions[5], gameResults[5], points = 0;
//    int playerWins = 0, gameWins = 0;
//
//    printf("���������Ԥ�⣨0��ʾ�䣬1��ʾӮ����\n");
//    for (int i = 0; i < 5; i++) {
//        scanf_s("%d", &playerPredictions[i]);
//        gameResults[i] = rand() % 2;  // ������Ϸ���
//        if (playerPredictions[i] == gameResults[i]) {
//            points += 100;  // ���Ԥ����ȷ������100��
//        }
//        // ������Һ���Ϸ��ʤ������
//        playerWins += (1 - playerPredictions[i]);
//        gameWins += gameResults[i];
//        // �����һ��Ӯ�����֣���Ϸ����
//        if (playerWins == 3 || gameWins == 3) {
//            break;
//        }
//    }
//
//    printf("���Ԥ���ǣ�\n");
//    for (int i = 0; i < 5; i++) {
//        printf("%d ", playerPredictions[i]);
//    }
//    printf("\n");
//
//    printf("��Ϸ����ǣ�\n");
//    for (int i = 0; i < 5; i++) {
//        printf("%d ", gameResults[i]);
//    }
//    printf("\n");
//
//    printf("������յ÷��ǣ�%d\n", points);
//
//    return 0;
//}
