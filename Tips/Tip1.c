// ����ơ�Ƶļ۸�ƿ�Ӻ͸��ӵĶһ�����
#define PRICE 2 // һƿơ�Ƶļ۸�Ϊ2Ԫ
#define BOTTLE_RATIO 2 // ������ƿ���Ի�һƿơ��
#define CAP_RATIO 4 // �ĸ�ƿ�ǿ��Ի�һƿơ��

// ����һ��������������Ǯ�����ضһ����ơ������
int beer_exchange(int money) {
    // ��ʼ��ơ�ơ�ƿ�Ӻ͸��ӵ�����
    int beer = money / PRICE; // ����Ǯ��ơ��
    int bottle = beer; // ��ʼ�Ŀ�ƿ��������ơ������
    int cap = beer; // ��ʼ��ƿ����������ơ������
    // ʹ��ѭ����ֱ��ƿ�Ӻ͸��Ӷ������һ�Ϊֹ
    while (bottle >= BOTTLE_RATIO || cap >= CAP_RATIO) {
        // ������Զһ���ơ������
        int exchange = bottle / BOTTLE_RATIO + cap / CAP_RATIO;
        // ����ơ�ơ�ƿ�Ӻ͸��ӵ�����
        beer += exchange;
        bottle = bottle % BOTTLE_RATIO + exchange;
        cap = cap % CAP_RATIO + exchange;
    }
    // �������յ�ơ������
    return beer;
}

// ����
#include <stdio.h>
int main() {
    printf("%d\n", beer_exchange(10)); // ��� 5
    printf("%d\n", beer_exchange(20)); // ��� 11
    return 0;
}
