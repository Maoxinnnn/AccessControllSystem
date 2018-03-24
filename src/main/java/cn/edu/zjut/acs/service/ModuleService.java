/** 
* @Filename: ModuleService.java
* @package: cn.com.itsea.acs.dao
* Date: 2017年12月04日 下午2:10:49
* Copyright: Copyright (c) 2017, 杭州海量信息技术有限公司  All Rights Reserved.
*/
package cn.edu.zjut.acs.service;

import java.util.List;
import java.util.Map;

import cn.edu.zjut.acs.model.Module;

/** 
 * @ClassName: ModuleService
 * @author  <a href="mailto:945922054@qq.com">余其刚</a> 
 * @date 创建时间：2017年12月04日 下午2:10:49
 * @version V1.0  
 * @since  JDK 1.7 
 */
public interface ModuleService {
	/**
     * 根据主键查询模块信息
     * @param id
     * @return JC_MODULE
     */
	Module getEntityByPK (Integer modulecode);
	/**
     * 查询模块信息列表
     * @param map
     * @return List<JC_MODULE>
     */
	List<Module> getModuleList (Map<String,Object> map);
	/**
	 * 通过模块名称查询模块信息
	 * @param modulename
	 * @return
	 */
	Module getModuleByModulename(String modulename);

	/**
	 * 通过菜单对应页面查询模块信息
	 * @param modulepage
	 * @return
	 */
	Module getModuleByModulepage(String modulepage);
	 /**
     * 添加模块信息
     * @param module
     * @param log
     */
    void t_insert(Module module);
    /**
     * 修改模块信息列表
     * @param module
     * @param log
     */
    void t_update(Module module);
    /**
     * 删除模块信息及其下属模块信息
     * @param module
     * @param rzjl
     */
    void t_delete(Module module);

}
