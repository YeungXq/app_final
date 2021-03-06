package cn.app.service.developer;

import cn.app.model.AppCategory;

import java.util.List;

public interface AppCategoryService {
	/**
	 * 根据父节点parentId获取相应的分类列表
	 */
	public List<AppCategory> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
