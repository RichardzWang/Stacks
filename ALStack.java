import java.util.ArrayList;

public class ALStack<T> implements Stack<T>{
    private ArrayList<T> _stack;


    //constructor
    public ALStack() 
	{ 
	    _stack = new ArrayList<T>();
    }



    public void push(T x) {
        _stack.add(x);
    }

    public T pop() {
	return _stack.remove(_stack.size()-1);
    }

    public T peek() {
        return _stack.get(_stack.size()-1);
    }

    public boolean isEmpty() {
	return _stack.size() <= 0;
    }

}
