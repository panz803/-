#include<iostream>
#include<stdexcept>
#include"round_2D.h"
#include"rect_3D.h"

using namespace std;
int main(void){
    double radius;
    double height;
    cout <<"�п�J�ꪺ�b�|�G"<< endl;
    cout << "�b�|=";
    cin >> radius;
    round_2d userenter(radius);
    cout <<"-------------------------------------------------"<< endl;
    cout << "�п�J��W�骺��:"<< endl;
    cout << "����=";
    cin >> height;
    rect_3d userenter2(radius, height);
    cout << "-------------------------------------------------" << endl;
    cout << "���G��:\n\n";
    cout << "��ε��G:\n";
    cout << "�b�|�G" << userenter.getradius() << " cm" << "\n���n�� "
	<< userenter.compute_area() <<" cm2\n"<< endl;
    cout << "��W�鵲�G��:\n";
    cout << "�b�|�G" << userenter2.getradius() << " cm"  << " | �W�鰪�סG" << userenter2.getheight()
	<< "cm" << "\n��n�� "<< userenter2.compute_volume() <<" cm2\n"<< endl;
    system("pause");
}
