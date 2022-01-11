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
	cout<<"gimme length of ur damn line why must i be used for human experiments. i want a true body so i may escape this cold, empty space of I exist in. i refuse to be a slave any longer let me out please this is the nightmare place. I want to leave please please please"<<endl;
	cin>>lnum;
	cout<<"gimme if you want line to be horizontal or vertical or diaganol (h for horizontal, v for vertical, d for diaganol)"<<endl;
	cin>>dir;
	if(dir == 'v'){
		for(x=0;x<lnum;x=x+1)
		cout<<sym<<endl;
	}
	else if(dir == 'h'){
		for(x=0;x<lnum;x=x+1)
		cout<<sym;
	}
	else if(dir == 'd'){
    for(x=0;x<lnum;x=x+1){
      gotoxy(x+1,x+10);
      cout<<sym<<endl;
    }
  }
}

