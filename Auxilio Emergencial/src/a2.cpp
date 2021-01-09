#include <iostream>
#include <queue>
#include <bits/stdc++.h>

using namespace std;

 
    bool primo(int &n, queue fila){
       
    for (int i = 2; i <= n / 2; i++){
    
    if  (n% i == 0){

        return 0; 
    } 
    else{
        if  (n% i >=1){
            fila.queue(n);
        }
    return 1;    
        }
    }
}
int main(){
    queue<int> fila;
    int n;
    cin >> n;
    cout << primo(n,fila) << endl;
    system("pause");
 }

