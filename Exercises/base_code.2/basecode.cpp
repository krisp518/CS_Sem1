// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int mylo = 0;
	char snow = 'q';
	cout<<"ayo gimme ur goddamn snowflake or ill make you play league of legends ranked"<<endl;
	cin>>snow;
	for(int vander = 0; vander<5; vander++){
		gotoxy(1,3+vander);
		cout<<snow<<endl;
		sleep(1);   
		gotoxy(1,3+vander);
		cout<<" "<<endl;
	}
}