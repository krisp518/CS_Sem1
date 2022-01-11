// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
    srand(time(NULL));
    char sym = 'q';
    int heig = 0;
    int widt = 0;
    int coordx = 0;
    int coordy = 8;
    int widt2 = widt-2;
    int heig2 = heig-1;
    int i=5;
    int k=5;
    cout<<"gimme border character"<<endl;
    cin>>sym;
    cout<<"gimme border length"<<endl;
    cin>>heig;
    cout<<"gimme border width"<<endl;
    cin>>widt;
    /*for(int counter = 0; counter<widt; counter++){
        cout<<endl;
        for(int counter2 = 0; counter2<heig; counter2++){
            cout<<sym;
        }
    }
    for(int jinx = 2; jinx<widt; jinx++){
        cout<<endl;
        for(int vi = 3; vi<heig; vi++){
            gotoxy(2,i);
            i++;
            cout<<"x";
        }
    }
     */   
        
    for(int y = 0; y<widt; y++){
        cout<<endl;
        for(int x = 0; x<heig; x++){
            cout<<sym;
        }
    }
    for(int y2 = 2; y2<widt; y2++){
        cout<<endl; 
        for(int x2 = 3; x2<heig; x2++){
            gotoxy(2,i);
            i++;
            cout<<"x";
        }
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        gotoxy(30,30);
}
        
 