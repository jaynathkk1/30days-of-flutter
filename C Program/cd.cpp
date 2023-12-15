
#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str;
    cout<<"enter the string";
    cin>>str;
    string s1,s2;
    for(int i=0;i<str.size();i++){
        if(isdigit(str[i])){
            s1 += str[i];
        }
        else{
            s2 += str[i];
        }
    }
    
    cout<<"Digit is "+s1+" \nstring is "+s2;

    return 0;
}
    

