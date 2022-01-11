// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x = 10;             //exact same as java
	cout<<x<<endl;         // System.out.println
	cout<<"yeah we are starting c++";              // System.out.print
	cout<<"yeah we are starting c++"<<endl;
	
	cout<<"gimme numba"<<endl;
	int y = 0;
	cin>>y; //cin for input
	cout<<"yo numba do be "<<y<<endl;
	
	char z = 'c';
	cout<<z;
	char zz = '&';
	cin>>zz; //can use input with characters just forgor to prompt
	
	///////////////////////////////////////////////////////////////////// new code poggers actual lab 1
	int num1 = 0;
	cout<<"gimme numba biyatch"<<endl;
	cin>>num1;
	int num2 = 0;
	cout<<"gimme second number"<<endl;
	cin>>num2;
	int ans = num1*num2;
	cout<<"the answer is "<<ans;

}
