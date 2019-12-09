package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/02/04
//
//--------------------------------------------------------------------------------

import life.expert.common.async.ThreadUtils;
import lombok.extern.slf4j.Slf4j;

import static life.expert.common.async.LogUtils.logAtError;

//import static life.expert.common.base.Preconditions.*;  //checkCollection
//import static life.expert.common.function.Patterns.*;    //for-comprehension

@Slf4j
public final class AlgoTwo
	{
	
	// constant
	private static final long SLEEP_TIME = 2L;
	
	private AlgoTwo()
		{
		}
	
	public static AlgoTwo of()
		{
		return new AlgoTwo();
		}
	
	public void run()
		{
		ThreadUtils.delay( SLEEP_TIME );
		
		}
		
	}
