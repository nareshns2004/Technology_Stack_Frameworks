#include <stdio.h>

int main(){

    int x;
    scanf("%d",&x);

    int cnt = 0;
    
    while(x>0){



        if(x%2!=0){
            cnt++;
        }

        x=x/2;

    }

    printf("%d",cnt);

    return 0;
}