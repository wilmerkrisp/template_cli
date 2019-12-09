package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/01/31
//
//--------------------------------------------------------------------------------









//import com.google.common.collect.ImmutableList;
//import cyclops.reactive.collections.immutable.LinkedListX;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.LongStream;









/**
 * The type Experiment data.
 */
@State( Scope.Thread )
public class ExperimentData
	{
	@Param( { "1000"  } ) public long iterations;
	
	
//	@Param( { "1000" ,
//	          "2000" ,
//	          "3000" ,
//	          "4000" ,
//	          "5000" ,
//	          "6000" ,
//	          "7000" ,
//	          "8000" ,
//	          "9000" ,
//	          "10000" } ) long iterations;
	
	
	
	public final Collection<String> collection_ = new ArrayList<>();
	
	/**
	 * Sets up.
	 */
	@Setup( Level.Invocation )
	public void setUp()
		{
		LongStream.range( 0 , iterations )
		          .forEach( ( l ) ->
		                    {
		                    collection_.add( Long.toString( l ) );
		                    } );
		}
	
	@Override
	public String toString()
		{
		return "ExperimentData{" + "iterations=" + iterations + ", collection_=" + collection_ + '}';
		}
	}
