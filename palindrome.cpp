//
// Created by anto on 15/8/24.
//
#include<iostream>
using namespace std;
bool palindrome(int num) {
    long int n=num;
    long int reverse =0;
    if(n<0) {
        return false;
    }
    while(n>0) {
        int digit=n%10;
        reverse = reverse*10 + digit;
        n/=10;
    }
    return reverse==num;
}

int main() {
    long int num = 121;
    cout<<palindrome(num);

}