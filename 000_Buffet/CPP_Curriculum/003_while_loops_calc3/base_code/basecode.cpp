// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char quit = 'r';
	char cont = 'v';
	while(true){
	char add = '+';
	char minus = '-';
	char multiply = '*';
	char divide = '/';
	int num1 = 0;
	cout<<"gimme furst numba"<<endl;
	cin>>num1;
	int num2 = 0;
	cout<<"gimme second numba"<<endl;
	cin>>num2;
	cout<<"gimme the operation symbol u wanna do"<<endl;
	char op = 'q';
	cin>>op;
	if(op == '+')
	{
		cout<<num1+num2<<endl;
	}
	else if(op == '-')
	{
		cout<<num1-num2<<endl;
	}
	else if(op == '*')
	{
		cout<<num1*num2<<endl;
	}
	else if(op == '/')
	{
		cout<<num1/num2<<endl;
	}
	cout<<"wanna leave this dog poo calculator? If so, type q. If you wanna continue, tye c"<<endl;
	cin>>quit;
	if(quit == 'q'){
			break;
		}
	else if(cont == 'c'){
	char add = '+';
	char minus = '-';
	char multiply = '*';
	char divide = '/';
	int num1 = 0;
	cout<<"gimme furst numba"<<endl;
	cin>>num1;
	int num2 = 0;
	cout<<"gimme second numba"<<endl;
	cin>>num2;
	cout<<"gimme the operation symbol u wanna do"<<endl;
	char op = 'q';
	cin>>op;
	if(op == '+')
	{
		cout<<num1+num2<<endl;
	}
	else if(op == '-')
	{
		cout<<num1-num2<<endl;
	}
	else if(op == '*')
	{
		cout<<num1*num2<<endl;
	}
	else if(op == '/')
	{
		cout<<num1/num2<<endl;
	}
	cout<<"wanna leave this dog poo calculator? If so, type q. If you wanna continue, tye c"<<endl;
	cin>>quit;
	if(quit == 'q'){
			break;
		}
	}
	}
}
