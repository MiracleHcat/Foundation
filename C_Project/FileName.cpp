//#include <stdio.h>
//#include <stdlib.h>
//#include <time.h>
//
//int main() {
//    srand(time(0));  // 初始化随机数生成器
//    int playerPredictions[5], gameResults[5], points = 0;
//    int playerWins = 0, gameWins = 0;
//
//    printf("请输入你的预测（0表示输，1表示赢）：\n");
//    for (int i = 0; i < 5; i++) {
//        scanf_s("%d", &playerPredictions[i]);
//        gameResults[i] = rand() % 2;  // 生成游戏结果
//        if (playerPredictions[i] == gameResults[i]) {
//            points += 100;  // 如果预测正确，增加100点
//        }
//        // 计算玩家和游戏的胜利次数
//        playerWins += (1 - playerPredictions[i]);
//        gameWins += gameResults[i];
//        // 如果任一方赢了三局，游戏结束
//        if (playerWins == 3 || gameWins == 3) {
//            break;
//        }
//    }
//
//    printf("你的预测是：\n");
//    for (int i = 0; i < 5; i++) {
//        printf("%d ", playerPredictions[i]);
//    }
//    printf("\n");
//
//    printf("游戏结果是：\n");
//    for (int i = 0; i < 5; i++) {
//        printf("%d ", gameResults[i]);
//    }
//    printf("\n");
//
//    printf("你的最终得分是：%d\n", points);
//
//    return 0;
//}
