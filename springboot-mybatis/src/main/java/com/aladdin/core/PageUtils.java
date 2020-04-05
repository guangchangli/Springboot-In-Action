package com.aladdin.core;

import com.github.pagehelper.PageInfo;

public class PageUtils {

    public static PageResponse getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResponse pageResponse = new PageResponse();
        pageResponse.setPageNum(pageInfo.getPageNum());
        pageResponse.setPageSize(pageInfo.getPageSize());
        pageResponse.setTotalSize(pageInfo.getTotal());
        pageResponse.setTotalPages(pageInfo.getPages());
        pageResponse.setContent(pageInfo.getList());
        return pageResponse;
    }
}