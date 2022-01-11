// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x = 0;
	int y = 0;
	char sym = 'r';
	int l = 0;
	int h = 0;
	cout<<"gimme sybmol you want"<<endl;
	cin>>sym;
	cout<<"gimme length of the box"<<endl;
	cin>>l;
	cout<<"gimme height of the box"<<endl;
	cin>>h;
	for(x=0;x!=l;x=x+1){
		cout<<endl;
	for(y=0;y!=h;y=y+1){
		cout<<sym;
	}
	}
}

