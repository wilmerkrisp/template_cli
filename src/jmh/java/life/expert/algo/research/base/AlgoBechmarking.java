package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/01/31
//
//--------------------------------------------------------------------------------









import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;



public class AlgoBechmarking
	{
	
	@Benchmark
	public  void algoOnee( ExperimentData data ,
	                     Blackhole hole )
		{
		AlgoOne a = AlgoOne.of();
		a.run();
		
		}
	
	
	@Benchmark
	public  void algoTwoo( ExperimentData data ,
	                     Blackhole hole )
		{
		AlgoTwo a = AlgoTwo.of();
		a.run();
		}
		
	}
