package myiterator;

import java.util.ArrayList;
import java.util.Iterator;

class FloatArray implements Iterable<Float>
{

	@Override
	public Iterator<Float> iterator() {
		// TODO Auto-generated method stub
		return new FloatArrayIterator();
	}
	
}

class FloatArrayIterator implements Iterator<Float>
{
	private float[] array = new float[]{1,2,3,4,5}; 
	private int i = 0;
	
	public boolean hasNext()
	{
		if(i >= array.length)
		{
			return false;
		}
		return true;
	}

	@Override
	public Float next() {
		// TODO Auto-generated method stub
		return array[i++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class SquareIterable implements Iterable<Float> {

	@Override
	public Iterator<Float> iterator() {
		// TODO Auto-generated method stub
		return new SquareIterator();
	}
	
}

class SquareIterator implements Iterator<Float> {

	Iterator<Float> it = new FloatArrayIterator();
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return it.hasNext();
	}

	@Override
	public Float next() {
		// TODO Auto-generated method stub
		float f = it.next();
		return f*f;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Main
{
	public static void main(String[] args)
	{
		FloatArray tracks = new FloatArray();
		ArrayList<Float> list = new ArrayList<Float>();
		list.add(1.0f);
		Iterator<Float> mine = list.iterator();
		
		/*for(Float h : new SquareIterable()) {
			System.out.println(h);
		}*/
		
		Iterator<Float> it = (new SquareIterable()).iterator();
		 while(it.hasNext())
		{
			Float f = it.next();
			System.out.println(f);
		}
		 it = (new SquareIterable()).iterator();
		 while(it.hasNext())
		{
			Float f = it.next();
			System.out.println(f);
		}
	}
}