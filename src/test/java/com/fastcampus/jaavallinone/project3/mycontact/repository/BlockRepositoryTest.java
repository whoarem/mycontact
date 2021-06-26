package com.fastcampus.jaavallinone.project3.mycontact.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.fastcampus.jaavallinone.project3.mycontact.domain.Block;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlockRepositoryTest {

  @Autowired
  private BlockRepository blockRepository;

  @Test
  void crud(){
    Block block = new Block();
    block.setName("martin");
    block.setReason("친하지않아서");
    block.setStartDate(LocalDate.now());
    block.setEndDate(LocalDate.now());

     blockRepository.save(block);

    List<Block> blocks = blockRepository.findAll();

    assertThat(blocks.size()).isEqualTo(3);
    assertThat(blocks.get(0).getName()).isEqualTo("dennis");
    assertThat(blocks.get(1).getName()).isEqualTo("sophia");
    assertThat(blocks.get(2).getName()).isEqualTo("martin");
  }

}