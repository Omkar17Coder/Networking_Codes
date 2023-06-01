#include<stdio.h>



// Accept the string containig even number of a and oddnumber of b

int main(){
// Total 4 states

int state;


int transitions[4][2]={{2,1},{3,0},{0,3},{1,2}};

int state=0;
string s;
cin>>s;
int n=s.size();
for(int i=0;i<n;i++){
    if(s[i]=='a'){
     state=transitions[state][0];
    }
    elseif(s[i]=='b'){
        int state=transitions[state][1];
    }
    else{
        continue;
    }
}

if(state==1){
    cout<<"String acccepted"<<endl;
}
else{
    cout<<"String rejected"<<endl;
}



return 0;

}