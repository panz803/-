#ifndef round3d_H
#define round3d_H
#include"round_2D.h"

using namespace std;/*�~�����O���ŧi��k���u�l�����O�G��¦���O�v*/
//�~��round_2d���O��rect_3d���O(�]�t5�Ӧ�����ƻP1�Ӹ�Ʀ��� + round_2d������ƻP��Ʀ���)

class rect_3d:public round_2d{
public:
    rect_3d(double = 0, double = 0 );//�غc�l
    void setheight(const double);//�]�w����
    double getheight();//���o����   
    double compute_volume() const;//�p����n
    double height;//��
};
#endif
