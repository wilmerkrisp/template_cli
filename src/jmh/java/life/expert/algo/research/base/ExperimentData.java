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
import java.util.List;
import java.util.stream.LongStream;









/**
 * The type Experiment data.
 */
@State( Scope.Thread )
public class ExperimentData
	{
	@Param( { "1000"  } ) long iterations;
	
	
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
	
	
	
	List< String > list = new ArrayList<>();
	
	
	
	/**
	 * Sets up.
	 */
	@Setup( Level.Invocation )
	public void setUp()
		{
		LongStream.range( 0 , iterations )
		          .forEach( ( l ) ->
		                    {
		                    list.add( Long.toString( l ) );
		                    } );
		}
		
		
	}
