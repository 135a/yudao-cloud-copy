package cn.iocoder.yudao.module.ai.service.model;

import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.ai.controller.admin.model.vo.chatRole.AiChatRolePageReqVO;
import cn.iocoder.yudao.module.ai.controller.admin.model.vo.chatRole.AiChatRoleSaveMyReqVO;
import cn.iocoder.yudao.module.ai.controller.admin.model.vo.chatRole.AiChatRoleSaveReqVO;
import cn.iocoder.yudao.module.ai.dal.dataobject.model.AiChatRoleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import cn.iocoder.yudao.module.ai.enums.ErrorCodeConstants.*;
import java.util.Collection;
import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.ai.enums.ErrorCodeConstants.CHAT_ROLE_DISABLE;
import static cn.iocoder.yudao.module.ai.enums.ErrorCodeConstants.CHAT_ROLE_NOT_EXISTS;

/**
 * AI 聊天角色 Service 实现类
 *
 * @author fansili
 */
@Service
@Slf4j
public class AiChatRoleServiceImpl implements AiChatRoleService {

    @Override
    public Long createChatRole(AiChatRoleSaveReqVO createReqVO) {
        return 0L;
    }

    @Override
    public Long createChatRoleMy(AiChatRoleSaveMyReqVO createReqVO, Long userId) {
        return 0L;
    }

    @Override
    public void updateChatRole(AiChatRoleSaveReqVO updateReqVO) {

    }

    @Override
    public void updateChatRoleMy(AiChatRoleSaveMyReqVO updateReqVO, Long userId) {

    }

    @Override
    public void deleteChatRole(Long id) {

    }

    @Override
    public void deleteChatRoleMy(Long id, Long userId) {

    }

    @Override
    public AiChatRoleDO getChatRole(Long id) {
        return null;
    }

    @Override
    public List<AiChatRoleDO> getChatRoleList(Collection<Long> ids) {
        return List.of();
    }

    /**
     * 校验聊天角色是否合法，验证角色存在且处于启用状态
     *
     * @param id 角色编号
     * @return 返回校验通过的聊天角色对象
     */
    @Override
    public AiChatRoleDO validateChatRole(Long id) {
        // 校验聊天角色是否存在
        AiChatRoleDO chatRole = validateChatRoleExists(id);
        // 校验聊天角色是否为禁用状态，如果是则抛出异常
        if (CommonStatusEnum.isDisable(chatRole.getStatus())) {
            throw exception(CHAT_ROLE_DISABLE, chatRole.getName());
        }
        return chatRole;
    }

    @Override
    public PageResult<AiChatRoleDO> getChatRolePage(AiChatRolePageReqVO pageReqVO) {
        return null;
    }

    @Override
    public PageResult<AiChatRoleDO> getChatRoleMyPage(AiChatRolePageReqVO pageReqVO, Long userId) {
        return null;
    }

    @Override
    public List<String> getChatRoleCategoryList() {
        return List.of();
    }

    @Override
    public List<AiChatRoleDO> getChatRoleListByName(String name) {
        return List.of();
    }
    private AiChatRoleDO validateChatRoleExists(Long id) {
        AiChatRoleDO chatRole = chatRoleMapper.selectById(id);
        if (chatRole == null) {
            throw exception(CHAT_ROLE_NOT_EXISTS);
        }
        return chatRole;
    }
}
