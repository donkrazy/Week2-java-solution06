package prob4;

public class MyStack implements Stack {
	private String[] buffer;
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
		String[] tempBuffer = new String[ capacity ];
		if( buffer != null ) {
			System.arraycopy( buffer, 0, tempBuffer, 0, top );
		}
		buffer = tempBuffer;
	}
	
	@Override
	public void push(String str) throws RuntimeException {
		if( capacity == top ) {
			capacity *= 2;
			resizeBuffer();
		}
		buffer[ top++ ] = str;
	}

	@Override
	public String pop() throws RuntimeException {
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
