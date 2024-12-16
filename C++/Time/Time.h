// Fig. 9.1: Time.h
// Time class definition.
// Member functions are defined in Time.cpp

// prevent multiple inclusions of header
//#ifndef TIME_H
//#define TIME_H

// Time class definition
class Date 
{
public:
   Date(); // constructor
   void setDate( int, int, int ); // set hour, minute and second
   void printUniversal() const; // print time in universal-time format//�L�X24�p�ɨ�ɶ� 
   void printROC() const; // print time in standard-time format//�L�X12�p�ɨ�ɶ�
private:
   unsigned int year; // 0 - 23 (24-hour clock format)
   unsigned int month; // 0 - 59
   unsigned int day; // 0 - 59
}; // end class Time

//#endif
