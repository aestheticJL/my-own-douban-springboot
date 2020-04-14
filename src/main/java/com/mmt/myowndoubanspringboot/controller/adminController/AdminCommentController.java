package com.mmt.myowndoubanspringboot.controller.adminController;

import com.mmt.myowndoubanspringboot.model.Comment;
import com.mmt.myowndoubanspringboot.model.RespBean;
import com.mmt.myowndoubanspringboot.service.admin.AdminCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/comment")
public class AdminCommentController {
    @Autowired
    AdminCommentService adminCommentService;
    @PostMapping("/")
    public RespBean addComment(@RequestBody Comment comment) {
        if (adminCommentService.addComment(comment) == 1){
            return RespBean.ok("评论成功");
        }else {
            return RespBean.error("评论失败");
        }
    }
}
