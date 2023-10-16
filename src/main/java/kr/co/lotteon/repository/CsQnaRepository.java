package kr.co.lotteon.repository;

import kr.co.lotteon.entity.cs.CsArticleNoticeEntity;
import kr.co.lotteon.entity.cs.CsArticleQnaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsQnaRepository extends JpaRepository<CsArticleQnaEntity, Integer> {

    public Page<CsArticleNoticeEntity> findCsArticleEntitiesByCate1AndUseynAndParent(String cate1, String useyn, int parent, Pageable pageable);
    public Page<CsArticleNoticeEntity> findCsArticleEntitiesByCate1AndCate2AndUseynAndParent(String cate1, String cate2, String useyn, int parent, Pageable pageable);

}
