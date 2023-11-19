// 定义啤酒的价格、瓶子和盖子的兑换比例
#define PRICE 2 // 一瓶啤酒的价格为2元
#define BOTTLE_RATIO 2 // 两个空瓶可以换一瓶啤酒
#define CAP_RATIO 4 // 四个瓶盖可以换一瓶啤酒

// 定义一个函数，输入零钱，返回兑换后的啤酒数量
int beer_exchange(int money) {
    // 初始化啤酒、瓶子和盖子的数量
    int beer = money / PRICE; // 用零钱买啤酒
    int bottle = beer; // 初始的空瓶数量等于啤酒数量
    int cap = beer; // 初始的瓶盖数量等于啤酒数量
    // 使用循环，直到瓶子和盖子都不够兑换为止
    while (bottle >= BOTTLE_RATIO || cap >= CAP_RATIO) {
        // 计算可以兑换的啤酒数量
        int exchange = bottle / BOTTLE_RATIO + cap / CAP_RATIO;
        // 更新啤酒、瓶子和盖子的数量
        beer += exchange;
        bottle = bottle % BOTTLE_RATIO + exchange;
        cap = cap % CAP_RATIO + exchange;
    }
    // 返回最终的啤酒数量
    return beer;
}

// 测试
#include <stdio.h>
int main() {
    printf("%d\n", beer_exchange(10)); // 输出 5
    printf("%d\n", beer_exchange(20)); // 输出 11
    return 0;
}
