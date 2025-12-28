package cn.iocoder.yudao.module.ai.service.chat;

import cn.hutool.core.lang.Assert;
import cn.iocoder.yudao.module.ai.controller.admin.chat.vo.conversation.AiChatConversationCreateMyReqVO;
import cn.iocoder.yudao.module.ai.dal.dataobject.chat.AiChatConversationDO;
import cn.iocoder.yudao.module.ai.dal.dataobject.model.AiChatRoleDO;
import cn.iocoder.yudao.module.ai.dal.dataobject.model.AiModelDO;
import cn.iocoder.yudao.module.ai.service.model.AiChatRoleService;
import cn.iocoder.yudao.module.ai.service.model.AiModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * AI 聊天对话 Service 实现类
 *
 * @author fansili
 */
@Service
@Validated
@Slf4j
public class AiChatConversationServiceImpl implements AiChatConversationService {
    @Resource
    private AiChatRoleService chatRoleService;
    @Resource
    private AiModelService modalService;
    @Override
    public Long createChatConversationMy(AiChatConversationCreateMyReqVO createReqVO, Long userId) {
//        // 1.1 获得 AiChatRoleDO 聊天角色
//        AiChatRoleDO role = createReqVO.getRoleId() != null ? chatRoleService.validateChatRole(createReqVO.getRoleId()) : null;
//        // 1.2 获得 AiModelDO 聊天模型
//        AiModelDO model = role != null && role.getModelId() != null ? modalService.validateModel(role.getModelId())
//                : modalService.getRequiredDefaultModel(AiModelTypeEnum.CHAT.getType());
//        Assert.notNull(model, "必须找到默认模型");
//        validateChatModel(model);
//
//        // 1.3 校验知识库
//        if (Objects.nonNull(createReqVO.getKnowledgeId())) {
//            knowledgeService.validateKnowledgeExists(createReqVO.getKnowledgeId());
//        }
//
//        // 2. 创建 AiChatConversationDO 聊天对话
//        AiChatConversationDO conversation = new AiChatConversationDO().setUserId(userId).setPinned(false)
//                .setModelId(model.getId()).setModel(model.getModel())
//                .setTemperature(model.getTemperature()).setMaxTokens(model.getMaxTokens()).setMaxContexts(model.getMaxContexts());
//        if (role != null) {
//            conversation.setTitle(role.getName()).setRoleId(role.getId()).setSystemMessage(role.getSystemMessage());
//        } else {
//            conversation.setTitle(AiChatConversationDO.TITLE_DEFAULT);
//        }
//        chatConversationMapper.insert(conversation);
//        return conversation.getId();
        return null;
    }
}
