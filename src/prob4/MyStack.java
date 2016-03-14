package prob4;

public class MyStack<E> implements Stack<E> {
	private E[] buffer;
	private int capacity;
	private int top;
	
	public MyStack( int capacity ) throws MyStackException {
		if( capacity <= 0 ) {
			throw new MyStackException( "init stack capacity > 0" );
		}
		
		this.capacity = capacity;
		this.top = 0;
		
		resizeBuffer();
	}
	
	private void resizeBuffer() {
		E[] tempBuffer = (E[])(new Object[ capacity ]);
		if( buffer != null ) {
			System.arraycopy( buffer, 0, tempBuffer, 0, top );
		}
		buffer = tempBuffer;
	}
	
	@Override
	public void push(E item){
		if( capacity == top ) {
			capacity *= 2;
			resizeBuffer();
		}
		buffer[ top++ ] = item;
	}

	@Override
	public E pop() {
		if( --top < 0 ) {
			top = 0;
			return null;
		}
		
		return buffer[ top ];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}
}
