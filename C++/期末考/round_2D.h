#ifndef round2d_H
#define round2d_H

using namespace std;//round_2d�����O(�]�t6�Ӧ�����ƻP2�Ӹ�Ʀ���)
class round_2d{
public:
    round_2d(double=0);//�غc�l
    void setradius(const double);//�]�w�b�|
    double getradius();//���o�b�|   
    double compute_area() const;//�p�⭱�n
    double radius;//�b�|
};
#endif
