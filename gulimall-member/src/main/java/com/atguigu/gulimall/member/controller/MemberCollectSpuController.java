package com.atguigu.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.atguigu.gulimall.member.entity.MemberEntity;
//import com.atguigu.gulimall.member.feign.CouponFeignService;
import com.atguigu.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.member.entity.MemberCollectSpuEntity;
import com.atguigu.gulimall.member.service.MemberCollectSpuService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 会员收藏的商品
 *
 * @author zhuzq
 * @email zzeqing93@gmail.com
 * @date 2025-02-13 23:35:36
 */
@RestController
@RequestMapping("member/membercollectspu")
public class MemberCollectSpuController {
    @Autowired
    private MemberCollectSpuService memberCollectSpuService;

    @Autowired
    private CouponFeignService couponFeignService;


    @RequestMapping("/coupons")
    public R test(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");

         R memberCoupon = couponFeignService.memberCoupon();

         return R.ok().put("coupons", memberCoupon.get("coupons"))  ;


    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:membercollectspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberCollectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:membercollectspu:info")
    public R info(@PathVariable("id") Long id){
		MemberCollectSpuEntity memberCollectSpu = memberCollectSpuService.getById(id);

        return R.ok().put("memberCollectSpu", memberCollectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:membercollectspu:save")
    public R save(@RequestBody MemberCollectSpuEntity memberCollectSpu){
		memberCollectSpuService.save(memberCollectSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:membercollectspu:update")
    public R update(@RequestBody MemberCollectSpuEntity memberCollectSpu){
		memberCollectSpuService.updateById(memberCollectSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:membercollectspu:delete")
    public R delete(@RequestBody Long[] ids){
		memberCollectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
