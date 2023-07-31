@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
return http.csrf().disable()
.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
.and().authorizeHttpRequests()
.requestMatchers(HttpMethod.POST, "/login").permitAll()
.requestMatchers(HttpMethod.DELETE, "/medicos").hasRole("ADMIN")
.requestMatchers(HttpMethod.DELETE, "/pacientes").hasRole("ADMIN")
.anyRequest().authenticated()
.and().addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
.build();
}



mais controle das anotações

@GetMapping("/{id}")
<br> 
@Secured("ROLE_ADMIN")
<br>
public ResponseEntity detalhar(@PathVariable Long id) {
var medico = repository.getReferenceById(id);
return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
}

@EnableMethodSecurity(securedEnabled = true)