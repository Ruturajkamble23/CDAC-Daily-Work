 package StacTest;

class Stack {
int tos ;
int Maxsize;
int Stack[];


void creatStack(int s){
    tos= -1;
    Maxsize= s;
    Stack  = new int  [Maxsize];
}
void push(int e){
 Stack[++tos] =e;   // here only increament element in defined stack
}
boolean if_full(){
    if(tos==Maxsize-1)
    return true;
    else
    return false;
}
int pop(){
int temp = Stack[tos];
tos--;
return (temp);
}
     boolean if_empty(){
        if (tos==-1)
        return true;
        else 
        return false;
     }

     void stack_print(){
        for (int i = tos ;i>-1;i--)
            System.out.println(Stack[i]);
     }
}





