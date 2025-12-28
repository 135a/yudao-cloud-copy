package cn.iocoder.yudao.module.ai.service.chat;

import cn.iocoder.yudao.module.ai.controller.admin.chat.vo.conversation.AiChatConversationCreateMyReqVO;

public interface AiChatConversationService {

    /**
     * 创建【我的】聊天对话
     *
     * @param createReqVO 创建信息
     * @param userId 用户编号
     * @return 编号
     */
    Long createChatConversationMy(AiChatConversationCreateMyReqVO createReqVO, Long userId);
}
