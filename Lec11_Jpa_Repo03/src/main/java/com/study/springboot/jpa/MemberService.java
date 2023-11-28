package com.study.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public void insert() {
		Member member;
		member = Member.builder().name("홍길동").email("abc1@abc.com").build();
		memberRepository.save(member);
		member = Member.builder().name("김길동").email("abc2@abc.com").build();
		memberRepository.save(member);
		member = Member.builder().name("장길동").email("abc3@abc.com").build();
		memberRepository.save(member);
		member = Member.builder().name("이길동").email("abc4@abc.com").build();
		memberRepository.save(member);
	}
	
	public List<Member> selectAll() {
		return memberRepository.findAll();
	}
	
	public Optional<Member> selectId(Long search) {
		Optional<Member> member = memberRepository.findById(search);
		return member;
	}
	
	public Optional<Member> selectName(String search) {
		Optional<Member> member = memberRepository.findByName(search);
		return member;
	}
	
	public Optional<Member> selectEmail(String search) {
		Optional<Member> member = memberRepository.findByEmail(search);
		return member;
	}
	
	public List<Member> selectNameLike(String search) {
		List<Member> member = memberRepository.findByNameLike(search);
		return member;
	}
//	
//	public List<Member> selectNameLike(String search, Sort sort) {
//		List<Member> member = memberRepository.findByNameLike(search, sort);
//		return member;
//	}
//	
//	public List<Member> selectNameLikeNameDesc(String search) {
//		List<Member> member = memberRepository.findByNameLikeNameDesc(search);
//		return member;
//	}
	
	
	
}
