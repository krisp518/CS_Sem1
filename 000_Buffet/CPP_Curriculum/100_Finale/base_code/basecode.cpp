// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int guessnum = 0;
	int ekko = 0;
	char sym;
	int heig;
	int widt;
	int gamble2; 
	cout<<"hey guess the lucky christmas number because krimas is all about gambling(tip: the lucky nuber is the password into christmas world and the lucky number is 4)"<<endl;
	cin>>guessnum; 
	cout<<guessnum; 
	gotoxy(1, 4);
	cout<<"the lucky number answer hee hee ha ha: 4"<<endl;
	if(guessnum == 4){
	cout<<"k now follow the snow trail"<<endl;
	///////////////////////////////// krimas scene poggers cuz chrismas mr poole poggers !!!!!!!
	for(int vander = 0; vander<5; vander++){
		gotoxy(2,6+vander);
		cout<<"*"<<endl;
		sleep(1);   
		gotoxy(2,6+vander);
		cout<<" "<<endl;
	}
	gotoxy(1, 14);
	cout<<"    /\\"<<endl;
	cout<<"   /* \\"<<endl;
	cout<<"  /  * \\"<<endl;
	cout<<" /*    *\\"<<endl;
	cout<<"/________\\"<<endl;
	cout<<"    ||"<<endl;
	cout<<"    ||"<<endl;
	//////////////////////
	for(int y = 0; y<6; y++){
		for(int x = 0; x<6; x++){
				gotoxy(15+x,1+y);
				cout<<"#";
			}
		}
	////////////////////////////////
	cout<<endl;
	cout<<"now make ur own gift box!!!!"<<endl;
	cout<<"what symbol bro"<<endl;
	cin>>sym;
	cout<<"what hegiht brah"<<endl;
	cin>>heig;
	cout<<"what width bro"<<endl;
	cin>>widt;
	for(int y2 = 0; y2!=heig; y2++){
		cout<<endl;
		gotoxy(1, 16);
	for(int x2 =0; x2!=widt;x2++){
		cout<<sym;
		}
	}
	cout<<endl;
	cout<<"now let's gamble again (I have crippling gambling adiction this is a cry for help) so like uh gimme number 1-100. press any button to make hell end"<<endl;
	cin>>gamble2;
	cout<<"drumroll uhhhh press button do make it stop"<<endl;
	
	getch();
	while(kbhit()==0){
	gotoxy(1,20);
	cout<<"the numero was: "<<random(100)<<endl;
	}
	cout<<"that's the christmas experience hope ya liked it"<<endl;
	}
}
