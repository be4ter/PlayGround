package kr.playground.jobs.vo;

import java.io.Serializable;

import kr.playground.jobs.vo.upper.AbstractVo;

public class CodeVo extends AbstractVo implements Serializable {
 	
	private String codeGrp ;
	private String code    ;
	private String codeNm  ;
	private String tmp1    ;
	private String tmp2    ;
	private String tmp3    ;
	private String tmp4    ;
	private String tmp5    ;
	private String useYn   ;
	private String delYn   ;
	
	private long count;
	
	
	public String getCodeGrp() {
		return codeGrp;
	}
	public void setCodeGrp(String codeGrp) {
		this.codeGrp = codeGrp;
	}
	
	public String getCodeNm() {
		return codeNm;
	}
	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}
	public String getTmp1() {
		return tmp1;
	}
	public void setTmp1(String tmp1) {
		this.tmp1 = tmp1;
	}
	public String getTmp2() {
		return tmp2;
	}
	public void setTmp2(String tmp2) {
		this.tmp2 = tmp2;
	}
	public String getTmp3() {
		return tmp3;
	}
	public void setTmp3(String tmp3) {
		this.tmp3 = tmp3;
	}
	public String getTmp4() {
		return tmp4;
	}
	public void setTmp4(String tmp4) {
		this.tmp4 = tmp4;
	}
	public String getTmp5() {
		return tmp5;
	}
	public void setTmp5(String tmp5) {
		this.tmp5 = tmp5;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the count
	 */
	public long getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(long count) {
		this.count = count;
	}

	
}
