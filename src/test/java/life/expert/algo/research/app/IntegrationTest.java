package life.expert.algo.research.app;
//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.app
//                           wilmer 2019/12/05
//
//--------------------------------------------------------------------------------

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import static life.expert.common.async.PrintUtils.print;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static life.expert.common.async.LogUtils.*;

public class IntegrationTest
	{
	@Ignore
	//@Test
	public void integrationTest()
	throws IOException
		{
		//@formatter:off
		String verified_ethalon = "Hello world!";
		//@formatter:on
		
		var verified_output = new StringBuilder();
		
		String         line;
		BufferedReader reader;
		
		Process process = Runtime.getRuntime()
		                         .exec( "build/distributions/graph/graph-1.0.0/bin/graph" );
		
		OutputStream stdin  = process.getOutputStream();
		InputStream  stderr = process.getErrorStream();
		InputStream  stdout = process.getInputStream();
		
		// write into stdin
		//		line = "C 1 1" + "\n";
		//		stdin.write( line.getBytes() );
		//		stdin.flush();
		//		stdin.close();
		
		// read from stdout
		reader = new BufferedReader( new InputStreamReader( stdout ) );
		while( ( line = reader.readLine() ) != null )
			{
			verified_output.append( line )
			               .append( '\n' );
			}
		reader.close();
		
		print("result="+verified_output.toString());
		
		// todo fix log messages during debug
		verified_output.delete( 0 , verified_output.indexOf( "\n" ) + 1 );
		verified_output.delete(  verified_output.indexOf( "\n" ) ,verified_output.length() );
		
		assertThat( verified_output.toString() , is( verified_ethalon ) );
		
		}
	}
