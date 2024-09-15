//
// Created by anto on 15/8/24.
//
#include<iostream>
using namespace std;

bool isPalindrome(int n) {
    long int number = n;
    long int reverse = 0;
    if(n<0){
        return false;
    }
    while(number >0){
        int digit =number%10;
        reverse = reverse*10+digit;
        number/=10;
    }
    return reverse==n ;
}
int main() {
    long int num = 121;
    cout<<isPalindrome(num);
}