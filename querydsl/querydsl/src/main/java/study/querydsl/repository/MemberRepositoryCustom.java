package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    // 내가 원하는 것을 구현하는 이름 -> Impl에서 구현한다.
    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition,
                                         Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition,
                                          Pageable pageable);
}
