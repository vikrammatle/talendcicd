
package globalbi_poc.testsimple_0_1.testsimpletest_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
import routines.DataMasking;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
 





@SuppressWarnings("unused")

/**
 * Job: TestSimpleTestTest Purpose: testing as part of poc<br>
 * Description:  <br>
 * @author mansoorahmed.shaik@mail.nissan.co.jp
 * @version 7.2.1.20190909_1035-patch
 * @status 
 */
public class TestSimpleTestTest implements TalendJob {
	static {System.setProperty("TalendJob.log", "TestSimpleTestTest.log");}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TestSimpleTestTest.class);

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(input_file1 != null){
				
					this.setProperty("input_file1", input_file1.toString());
				
			}
			
			if(reference_file1 != null){
				
					this.setProperty("reference_file1", reference_file1.toString());
				
			}
			
		}

		public String input_file1;
		public String getInput_file1(){
			return this.input_file1;
		}
		
		public String reference_file1;
		public String getReference_file1(){
			return this.reference_file1;
		}
		
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "TestSimpleTest";
	private final String projectName = "GLOBALBI_POC";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_ROjkECFdEeqNsKbc2fYwYw", "0.1");
	org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				TestSimpleTestTest.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(TestSimpleTestTest.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tCreateTemporaryFile_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tCreateTemporaryFile_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileCompare_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileCompare_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAssert_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tAssert_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tCreateTemporaryFile_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileCompare_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tAssert_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	




	





public void tCreateTemporaryFile_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tCreateTemporaryFile_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tCreateTemporaryFile_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tCreateTemporaryFile_1", false);
		start_Hash.put("tCreateTemporaryFile_1", System.currentTimeMillis());
		
	
	currentComponent="tCreateTemporaryFile_1";

	
		int tos_count_tCreateTemporaryFile_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tCreateTemporaryFile_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tCreateTemporaryFile_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tCreateTemporaryFile_1 = new StringBuilder();
                    log4jParamters_tCreateTemporaryFile_1.append("Parameters:");
                            log4jParamters_tCreateTemporaryFile_1.append("REMOVE" + " = " + "true");
                        log4jParamters_tCreateTemporaryFile_1.append(" | ");
                            log4jParamters_tCreateTemporaryFile_1.append("USE_DEFAULT_DIR" + " = " + "true");
                        log4jParamters_tCreateTemporaryFile_1.append(" | ");
                            log4jParamters_tCreateTemporaryFile_1.append("USE_PREFIX" + " = " + "true");
                        log4jParamters_tCreateTemporaryFile_1.append(" | ");
                            log4jParamters_tCreateTemporaryFile_1.append("PREFIX" + " = " + "\"talend_\"");
                        log4jParamters_tCreateTemporaryFile_1.append(" | ");
                            log4jParamters_tCreateTemporaryFile_1.append("SUFFIX" + " = " + "\"tmp\"");
                        log4jParamters_tCreateTemporaryFile_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tCreateTemporaryFile_1 - "  + (log4jParamters_tCreateTemporaryFile_1) );
                    } 
                } 
            new BytesLimit65535_tCreateTemporaryFile_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tCreateTemporaryFile_1", "tCreateTemporaryFile");
				talendJobLogProcess(globalMap);
			}
			


				final StringBuffer log4jSb_tCreateTemporaryFile_1 = new StringBuffer();
			
	java.io.File dir_tCreateTemporaryFile_1 = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"));
dir_tCreateTemporaryFile_1.mkdirs();
java.io.File file_tCreateTemporaryFile_1;
String name_tCreateTemporaryFile_1 = "talend_";
String suffix_tCreateTemporaryFile_1 = ("".equals("tmp")) ? null : "." + "tmp".replaceAll("\\.", "");
file_tCreateTemporaryFile_1 = java.io.File.createTempFile(name_tCreateTemporaryFile_1, suffix_tCreateTemporaryFile_1, dir_tCreateTemporaryFile_1);

if (true || file_tCreateTemporaryFile_1.createNewFile()){
    file_tCreateTemporaryFile_1.deleteOnExit();
}
globalMap.put("tCreateTemporaryFile_1_FILEPATH", file_tCreateTemporaryFile_1.getCanonicalPath());

	log.info("tCreateTemporaryFile_1 - tmp file path : " + file_tCreateTemporaryFile_1.getCanonicalPath() + ".");

 



/**
 * [tCreateTemporaryFile_1 begin ] stop
 */
	
	/**
	 * [tCreateTemporaryFile_1 main ] start
	 */

	

	
	
	currentComponent="tCreateTemporaryFile_1";

	

 


	tos_count_tCreateTemporaryFile_1++;

/**
 * [tCreateTemporaryFile_1 main ] stop
 */
	
	/**
	 * [tCreateTemporaryFile_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tCreateTemporaryFile_1";

	

 



/**
 * [tCreateTemporaryFile_1 process_data_begin ] stop
 */
	
	/**
	 * [tCreateTemporaryFile_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tCreateTemporaryFile_1";

	

 



/**
 * [tCreateTemporaryFile_1 process_data_end ] stop
 */
	
	/**
	 * [tCreateTemporaryFile_1 end ] start
	 */

	

	
	
	currentComponent="tCreateTemporaryFile_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tCreateTemporaryFile_1 - "  + ("Done.") );

ok_Hash.put("tCreateTemporaryFile_1", true);
end_Hash.put("tCreateTemporaryFile_1", System.currentTimeMillis());




/**
 * [tCreateTemporaryFile_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tCreateTemporaryFile_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tFileInputDelimited_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tCreateTemporaryFile_1 finally ] start
	 */

	

	
	
	currentComponent="tCreateTemporaryFile_1";

	

 



/**
 * [tCreateTemporaryFile_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tCreateTemporaryFile_1_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_GLOBALBI_POC_TestSimpleTest = new byte[0];
    static byte[] commonByteArray_GLOBALBI_POC_TestSimpleTest = new byte[0];

	
			    public String ID;

				public String getID () {
					return this.ID;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_GLOBALBI_POC_TestSimpleTest.length) {
				if(length < 1024 && commonByteArray_GLOBALBI_POC_TestSimpleTest.length == 0) {
   					commonByteArray_GLOBALBI_POC_TestSimpleTest = new byte[1024];
				} else {
   					commonByteArray_GLOBALBI_POC_TestSimpleTest = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_GLOBALBI_POC_TestSimpleTest, 0, length);
			strReturn = new String(commonByteArray_GLOBALBI_POC_TestSimpleTest, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_GLOBALBI_POC_TestSimpleTest) {

        	try {

        		int length = 0;
		
					this.ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID="+ID);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_GLOBALBI_POC_TestSimpleTest = new byte[0];
    static byte[] commonByteArray_GLOBALBI_POC_TestSimpleTest = new byte[0];

	
			    public String java;

				public String getJava () {
					return this.java;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_GLOBALBI_POC_TestSimpleTest.length) {
				if(length < 1024 && commonByteArray_GLOBALBI_POC_TestSimpleTest.length == 0) {
   					commonByteArray_GLOBALBI_POC_TestSimpleTest = new byte[1024];
				} else {
   					commonByteArray_GLOBALBI_POC_TestSimpleTest = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_GLOBALBI_POC_TestSimpleTest, 0, length);
			strReturn = new String(commonByteArray_GLOBALBI_POC_TestSimpleTest, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_GLOBALBI_POC_TestSimpleTest) {

        	try {

        		int length = 0;
		
					this.java = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.java,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("java="+java);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(java == null){
        					sb.append("<null>");
        				}else{
            				sb.append(java);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row3Struct row3 = new row3Struct();
row3Struct row4 = row3;





	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";

	
			if (execStat || enableLogStash) {
				if(resourceMap.get("inIterateVComp") == null){
					
						
						if(execStat) {
							runStat.updateStatOnConnection("row4"+iterateId, 0, 0);
						}
						
						
						
						if(enableLogStash) {
							runStat.logStatOnConnection("row4"+iterateId, 0, 0);
						}
						
					
				}
			} 

		
		int tos_count_tFileOutputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_1.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "((String)globalMap.get(\"tCreateTemporaryFile_1_FILEPATH\"))");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\";\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("INCLUDEHEADER" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + (log4jParamters_tFileOutputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File(((String)globalMap.get("tCreateTemporaryFile_1_FILEPATH")))).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */";"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                                log.info("tFileOutputDelimited_1 - Creating directory '" + dir_tFileOutputDelimited_1.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_1.mkdirs();
                                log.info("tFileOutputDelimited_1 - The directory '"+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
                        if(fileToDelete_tFileOutputDelimited_1.exists()) {
                            fileToDelete_tFileOutputDelimited_1.delete();
                        }
                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false),"ISO-8859-15"));


        resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */



	
	/**
	 * [tLogRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_1", false);
		start_Hash.put("tLogRow_1", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_1";

	
			if (execStat || enableLogStash) {
				if(resourceMap.get("inIterateVComp") == null){
					
						
						if(execStat) {
							runStat.updateStatOnConnection("row3"+iterateId, 0, 0);
						}
						
						
						
						if(enableLogStash) {
							runStat.logStatOnConnection("row3"+iterateId, 0, 0);
						}
						
					
				}
			} 

		
		int tos_count_tLogRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLogRow_1 = new StringBuilder();
                    log4jParamters_tLogRow_1.append("Parameters:");
                            log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_UNIQUE" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_LABEL" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_UNIQUE_LABEL" + " = " + "false");
                        log4jParamters_tLogRow_1.append(" | ");
                            log4jParamters_tLogRow_1.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_tLogRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + (log4jParamters_tLogRow_1) );
                    } 
                } 
            new BytesLimit65535_tLogRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tLogRow_1", "tLogRow");
				talendJobLogProcess(globalMap);
			}
			

	///////////////////////
		


	class Util_tLogRow_1 {
	
		String[] des_top = { ".", "-" };

        String[] des_data = { "-", "+" };

        String[] des_frame = { "|" }; 
        
        public void printLine(StringBuilder sb, int titleWidth, int dataWidth){
        
        	sb.append("+");
			for(int i=0; i<titleWidth+2; i++)
				sb.append("-");
			sb.append("+");
			for(int i=0; i<dataWidth+2; i++)
				sb.append("-");
        	sb.append("+" + "\n");
        }      

		public String print(String[] row, int nbLine){
			
			StringBuilder sb = new StringBuilder();
			
			    String title = "#" + nbLine + ". " + "tLogRow_1";
			    
		
			//step 1: get the max length of all the row[] member;
			int dataWidth = 5;		//the length of the string "value"	
			for(int i=0;i<row.length;i++) {
				if(row[i] == null && 4 > dataWidth) {
					dataWidth = 4;
				}
				else if(row[i] != null && row[i].length()>dataWidth) 
					dataWidth = row[i].length();
			}			
						
			int titleWidth = 3;
			
			int totalWidth = dataWidth + titleWidth + 5;
			
			//step 2: print the header with line number
			sb.append(".");
			for(int i=0 ; i<totalWidth ; i++)
				sb.append("-");			
			sb.append("." + "\n" + "|");
			
			int emptyCenterWidth = (totalWidth-title.length())/2;
			for(int i=0 ; i<emptyCenterWidth; i++)
				sb.append(" ");	
			sb.append(title);
			for(int i=0 ; i<totalWidth - emptyCenterWidth - title.length() ; i++)
				sb.append(" ");	
			sb.append("|" + "\n");
			
			//step 3: print "key" and "value"			
			printLine(sb,titleWidth,dataWidth);
			
			sb.append("|" + " key");
			for(int i=0; i<titleWidth-2; i++)
				sb.append(" ");
        	sb.append("|" + " value");
			for(int i=0; i<dataWidth-4; i++)
				sb.append(" ");
			sb.append("|" + "\n");
			
			printLine(sb,titleWidth,dataWidth);
			
			//step 4: print dataset
			
			//for(int i=0; i<row.length; i++){
				sb.append("| " + "ID");
				for(int i=0; i<titleWidth -"ID".length()+ 1 ;i++)
					sb.append(" ");
				sb.append("| " + row[0]);
				for(int i=0; row[0] == null && i<dataWidth - 3 || row[0] != null && i<dataWidth -row[0].length()+ 1 ;i++)
					sb.append(" ");
				sb.append("|" + "\n");
			
			//}

			
			//step 5: print a line gap
			printLine(sb,titleWidth,dataWidth);
			return sb.toString();

		}


	}

	Util_tLogRow_1 util_tLogRow_1 = new Util_tLogRow_1();




	java.io.PrintStream consoleOut_tLogRow_1 = null;
	if (globalMap.get("tLogRow_CONSOLE")!=null){
        consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
    }else{
        consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
        globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
    }

 		StringBuilder strBuffer_tLogRow_1 = null;
		int nb_line_tLogRow_1 = 0;
///////////////////////    			



 



/**
 * [tLogRow_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_1.append("Parameters:");
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "context.input_file1");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\";\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("HEADER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("RANDOM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("java")+"}]");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + (log4jParamters_tFileInputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tFileInputDelimited_1", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = context.input_file1;
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(context.input_file1, "ISO-8859-15",";","\n",true,0,0,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
							
								
									log.error("tFileInputDelimited_1 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row3 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row3 = new row3Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row3.java = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
												log.error("tFileInputDelimited_1 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row3 = null;
			                				
			    					}
								
			log.debug("tFileInputDelimited_1 - Retrieving the record " + fid_tFileInputDelimited_1.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

			//row3
			//row3


			
				
				if(execStat){
					runStat.updateStatOnConnection("row3"+iterateId,1, 1);
				}
				
				
				
				if(enableLogStash) {
					runStat.logStatOnConnection("row3"+iterateId,1, 1);
				}
				
			

		
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_1 = new StringBuilder();




   				
	    		if(row3.ID != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row3.ID)							
				);


							
	    		} //  			

				
				String[] row_tLogRow_1 = new String[1];
   				
	    		if(row3.ID != null) { //              
                 row_tLogRow_1[0]=    						    
				                String.valueOf(row3.ID)			
					          ;	
							
	    		} //			
    			
				nb_line_tLogRow_1++;
                consoleOut_tLogRow_1.println(util_tLogRow_1.print(row_tLogRow_1,nb_line_tLogRow_1));
                consoleOut_tLogRow_1.flush();
                	log.info("tLogRow_1 - Content of row "+nb_line_tLogRow_1+": " + TalendString.unionString("|",row_tLogRow_1));
//////

//////                    
                    
///////////////////////    			

 
     row4 = row3;


	tos_count_tLogRow_1++;

/**
 * [tLogRow_1 main ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

			//row4
			//row4


			
				
				if(execStat){
					runStat.updateStatOnConnection("row4"+iterateId,1, 1);
				}
				
				
				
				if(enableLogStash) {
					runStat.logStatOnConnection("row4"+iterateId,1, 1);
				}
				
			

		
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(row4.java != null) {
                        sb_tFileOutputDelimited_1.append(
                            row4.java
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");




 


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */



	
	/**
	 * [tLogRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_end ] stop
 */

} // End of branch "row3"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	



            }
            }finally{
                if(!((Object)(context.input_file1) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
						log.info("tFileInputDelimited_1 - Retrieved records count: "+ fid_tFileInputDelimited_1.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tLogRow_1 end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	


//////
//////
globalMap.put("tLogRow_1_NB_LINE",nb_line_tLogRow_1);
                if(log.isInfoEnabled())
            log.info("tLogRow_1 - "  + ("Printed row count: ")  + (nb_line_tLogRow_1)  + (".") );

///////////////////////    			

			
			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
	 				runStat.updateStatOnConnection("row3"+iterateId,2, 0);
			 	}
			}
			
			
			
			if(enableLogStash){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		
			 		RunStat.StatBean talend_statebean = runStat.logStatOnConnection("row3"+iterateId,2, 0);
			 		
			 		talendJobLog.addConnectionMessage(
					    "tFileInputDelimited_1", 
					    "tFileInputDelimited", 
					    false,
					    "output",
					    "row3",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					
			 		talendJobLog.addConnectionMessage(
					    "tLogRow_1", 
					    "tLogRow", 
					    true,
					    "input",
					    "row3",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					talendJobLogProcess(globalMap);
					
			 	}
			}
			
		
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Done.") );

ok_Hash.put("tLogRow_1", true);
end_Hash.put("tLogRow_1", System.currentTimeMillis());




/**
 * [tLogRow_1 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			
			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
	 				runStat.updateStatOnConnection("row4"+iterateId,2, 0);
			 	}
			}
			
			
			
			if(enableLogStash){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		
			 		RunStat.StatBean talend_statebean = runStat.logStatOnConnection("row4"+iterateId,2, 0);
			 		
			 		talendJobLog.addConnectionMessage(
					    "tLogRow_1", 
					    "tLogRow", 
					    false,
					    "output",
					    "row4",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					
			 		talendJobLog.addConnectionMessage(
					    "tFileOutputDelimited_1", 
					    "tFileOutputDelimited", 
					    true,
					    "input",
					    "row4",
					    talend_statebean.getNbLine(),
					    talend_statebean.getStartTime(),
					    talend_statebean.getEndTime()
					);
					talendJobLogProcess(globalMap);
					
			 	}
			}
			
		
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tFileCompare_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tLogRow_1 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	

public void tFileCompare_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileCompare_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileCompare_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileCompare_1", false);
		start_Hash.put("tFileCompare_1", System.currentTimeMillis());
		
	
	currentComponent="tFileCompare_1";

	
		int tos_count_tFileCompare_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileCompare_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileCompare_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileCompare_1 = new StringBuilder();
                    log4jParamters_tFileCompare_1.append("Parameters:");
                            log4jParamters_tFileCompare_1.append("COMPARISON_MODE" + " = " + "TEXT_CMP");
                        log4jParamters_tFileCompare_1.append(" | ");
                            log4jParamters_tFileCompare_1.append("FILE" + " = " + "((String)globalMap.get(\"tCreateTemporaryFile_1_FILEPATH\"))");
                        log4jParamters_tFileCompare_1.append(" | ");
                            log4jParamters_tFileCompare_1.append("FILE_REF" + " = " + "context.reference_file1");
                        log4jParamters_tFileCompare_1.append(" | ");
                            log4jParamters_tFileCompare_1.append("DIFFER_MESSAGE" + " = " + "\"[job \" + jobName + \"] Files differ\"");
                        log4jParamters_tFileCompare_1.append(" | ");
                            log4jParamters_tFileCompare_1.append("NO_DIFFER_MESSAGE" + " = " + "\"[job \" + jobName + \"] Files are identical\"");
                        log4jParamters_tFileCompare_1.append(" | ");
                            log4jParamters_tFileCompare_1.append("PRINT" + " = " + "true");
                        log4jParamters_tFileCompare_1.append(" | ");
                            log4jParamters_tFileCompare_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileCompare_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileCompare_1 - "  + (log4jParamters_tFileCompare_1) );
                    } 
                } 
            new BytesLimit65535_tFileCompare_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tFileCompare_1", "tFileCompare");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileCompare_1 begin ] stop
 */
	
	/**
	 * [tFileCompare_1 main ] start
	 */

	

	
	
	currentComponent="tFileCompare_1";

	

 

				final StringBuffer log4jSb_tFileCompare_1 = new StringBuffer();
			

boolean result_tFileCompare_1 = true;
	
if (result_tFileCompare_1)
{
	
		java.io.BufferedReader file_tFileCompare_1 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(((String)globalMap.get("tCreateTemporaryFile_1_FILEPATH"))),"ISO-8859-15"));
		java.io.BufferedReader fileRef_tFileCompare_1 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(context.reference_file1),"ISO-8859-15"));
		String content_tFileCompare_1 = null,contentRef_tFileCompare_1 = null;
		while((content_tFileCompare_1 = file_tFileCompare_1.readLine()) != null && (contentRef_tFileCompare_1 = fileRef_tFileCompare_1.readLine()) != null)
		{
			if(content_tFileCompare_1.compareTo(contentRef_tFileCompare_1) != 0)
			{
				result_tFileCompare_1 = false;
				break;
			}
		}
		
		// Check if files has a different number of lines:
		if(content_tFileCompare_1 == null){
		    // This step is done in case of the while upper ignore second part:
		    contentRef_tFileCompare_1 = fileRef_tFileCompare_1.readLine();
		}
		if(content_tFileCompare_1 != null || contentRef_tFileCompare_1 != null){
		    result_tFileCompare_1 = false;
		}
		
		file_tFileCompare_1.close();
		fileRef_tFileCompare_1.close();
		
}

String messagetFileCompare_1 = "";
if (result_tFileCompare_1) {
	messagetFileCompare_1 = "[job " + jobName + "] Files are identical";
	
} else {
	messagetFileCompare_1 = "[job " + jobName + "] Files differ";
}
globalMap.put("tFileCompare_1_DIFFERENCE",result_tFileCompare_1);

    System.out.println(messagetFileCompare_1);
	log.info("tFileCompare_1 - Compare result : " + messagetFileCompare_1 + ".");
 


	tos_count_tFileCompare_1++;

/**
 * [tFileCompare_1 main ] stop
 */
	
	/**
	 * [tFileCompare_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileCompare_1";

	

 



/**
 * [tFileCompare_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileCompare_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileCompare_1";

	

 



/**
 * [tFileCompare_1 process_data_end ] stop
 */
	
	/**
	 * [tFileCompare_1 end ] start
	 */

	

	
	
	currentComponent="tFileCompare_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tFileCompare_1 - "  + ("Done.") );

ok_Hash.put("tFileCompare_1", true);
end_Hash.put("tFileCompare_1", System.currentTimeMillis());




/**
 * [tFileCompare_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileCompare_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tAssert_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileCompare_1 finally ] start
	 */

	

	
	
	currentComponent="tFileCompare_1";

	

 



/**
 * [tFileCompare_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileCompare_1_SUBPROCESS_STATE", 1);
	}
	

public void tAssert_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tAssert_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tAssert_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tAssert_1", false);
		start_Hash.put("tAssert_1", System.currentTimeMillis());
		
	
	currentComponent="tAssert_1";

	
		int tos_count_tAssert_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addComponentMessage("tAssert_1", "tAssert");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tAssert_1 begin ] stop
 */
	
	/**
	 * [tAssert_1 main ] start
	 */

	

	
	
	currentComponent="tAssert_1";

	



if(!((Boolean)globalMap.get("tFileCompare_1_DIFFERENCE"))){
   if (junitGlobalMap.get("tests.log") == null) {
        junitGlobalMap.put("tests.log", new String());
   }
   if (junitGlobalMap.get("tests.nbFailure") == null) {
        junitGlobalMap.put("tests.nbFailure", new Integer(0));
   }
   junitGlobalMap.put("tests.log",((String)junitGlobalMap.get("tests.log"))+"tAssert_1:"+ "File from reference differs from input"+java.lang.System.getProperty("line.separator"));
   junitGlobalMap.put("tests.nbFailure",((Integer)junitGlobalMap.get("tests.nbFailure"))+1);
}else{
   assertTrue(((Boolean)globalMap.get("tFileCompare_1_DIFFERENCE")));
}
 


	tos_count_tAssert_1++;

/**
 * [tAssert_1 main ] stop
 */
	
	/**
	 * [tAssert_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAssert_1";

	

 



/**
 * [tAssert_1 process_data_begin ] stop
 */
	
	/**
	 * [tAssert_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tAssert_1";

	

 



/**
 * [tAssert_1 process_data_end ] stop
 */
	
	/**
	 * [tAssert_1 end ] start
	 */

	

	
	
	currentComponent="tAssert_1";

	

 

ok_Hash.put("tAssert_1", true);
end_Hash.put("tAssert_1", System.currentTimeMillis());




/**
 * [tAssert_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tAssert_1 finally ] start
	 */

	

	
	
	currentComponent="tAssert_1";

	

 



/**
 * [tAssert_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tAssert_1_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";

	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		if(jcm.component_name == null) {//job level log
			if(jcm.status == null) {//job start
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version).timestamp(jcm.moment).build();
				auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
			} else {//job end
				long timeMS = jcm.end_time - jcm.start_time;
				String duration = String.format(java.util.Locale.US, "%1$.2fs", (timeMS * 1.0)/1000);
			
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
				auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
			}
		} else if(jcm.current_connector == null) {//component log
			log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else {//component connector meter log
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.format(java.util.Locale.US, "%1$.2fs", (timeMS * 1.0)/1000);
			
			if(jcm.current_connector_as_input) {//log current component input line
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.connectorType(jcm.component_name).connectorId(jcm.component_id)
					.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
					.rows(jcm.total_row_number).duration(duration).build();
				auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
			} else {//log current component output/reject line
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.connectorType(jcm.component_name).connectorId(jcm.component_id)
					.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
					.rows(jcm.total_row_number).duration(duration).build();
				auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
			}
		}
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    private PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final TestSimpleTestTest TestSimpleTestTestClass = new TestSimpleTestTest();

        int exitCode = TestSimpleTestTestClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'TestSimpleTest' - Done.");
	        }

        System.exit(exitCode);
    }

      @Test
        public void testDefault() throws java.lang.Exception{
         if(1<=0){
            throw new java.lang.Exception("There is no tAssert in your test case!");
          }
            junitGlobalMap.put("tests.log",new String());
            junitGlobalMap.put("tests.nbFailure",new Integer(0));
            final TestSimpleTestTest TestSimpleTestTestClass = new TestSimpleTestTest();
            java.util.List<String> paraList_Default = new java.util.ArrayList<String>();
            paraList_Default.add("--context=Default");
        String[] arrays = new String[paraList_Default.size()];
        for(int i=0;i<paraList_Default.size();i++){
            arrays[i] = (String)paraList_Default.get(i);
        }
        TestSimpleTestTestClass.runJobInTOS(arrays);

        String errors = (String)junitGlobalMap.get("tests.log");
        Integer nbFailure = (Integer)junitGlobalMap.get("tests.nbFailure");
        assertTrue("Failure="+nbFailure+java.lang.System.getProperty("line.separator")+errors, errors.isEmpty());

         if(TestSimpleTestTestClass.exception!=null){
            throw TestSimpleTestTestClass.exception;
        }
        }

    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }

	        if(!"".equals(log4jLevel)){
				if("trace".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.OFF);
				}
				org.apache.log4j.Logger.getRootLogger().setLevel(log.getLevel());
    	    }
        	log.info("TalendJob: 'TestSimpleTest' - Start.");
    	
    	
    	
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = TestSimpleTestTest.class.getClassLoader().getResourceAsStream("globalbi_poc/testsimple_0_1/testsimpletest_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = TestSimpleTestTest.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                //defaultProps is in order to keep the original context value
                if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                }
                
                inContext.close();
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("input_file1", "id_File");
                            context.input_file1=(String) context.getProperty("input_file1");
                        context.setContextType("reference_file1", "id_File");
                            context.reference_file1=(String) context.getProperty("reference_file1");
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("input_file1")) {
                context.input_file1 = (String) parentContextMap.get("input_file1");
            }if (parentContextMap.containsKey("reference_file1")) {
                context.reference_file1 = (String) parentContextMap.get("reference_file1");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();




this.globalResumeTicket = true;//to run tPreJob



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tCreateTemporaryFile_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tCreateTemporaryFile_1) {
globalMap.put("tCreateTemporaryFile_1_SUBPROCESS_STATE", -1);

e_tCreateTemporaryFile_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TestSimpleTestTest");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;
    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();







        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--monitoring=")) {//for trunjob call
			enableLogStash = "true".equalsIgnoreCase(arg.substring(13));
		}
		
		if(!enableLogStash) {
			enableLogStash = "true".equalsIgnoreCase(System.getProperty("monitoring"));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     89653 characters generated by Talend Cloud Real-Time Big Data Platform 
 *     on the December 18, 2019 9:30:17 AM GMT
 ************************************************************************************************/