// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x = 0;
	char sym = 'r';
	int lnum = 0;
	char dir = 'q';
	cout<<"gimme line sybmol you want"<<endl;
	cin>>sym;
	cout<<"gimme length of the frickin line"<<endl;
	cin>>lnum;
	cout<<"gimme if you want line to be horizontal or vertical (h for horizontal, v for vertical)"<<endl;
	cin>>dir;
	if(dir == 'v'){
		for(x=0;x<lnum;x=x+1)
		cout<<sym<<endl;
	}
	else if(dir == 'h'){
		for(x=0;x<lnum;x=x+1)
		cout<<sym;
	}
}
